package com.gestion.service.api.service.rest.exception;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.gestion.service.api.to.ErrorMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;

@Provider
public class ServiceExceptionHandler implements ExceptionMapper<Throwable> {

    private static final String ERR_LOG_FORMAT = "{} : {}";

    static final Logger LOGGER = LoggerFactory.getLogger(ServiceExceptionHandler.class);

    @Override
    public Response toResponse(Throwable exception) {

        if (exception instanceof BadRequestException) {
            BadRequestException badRequestException = (BadRequestException) exception;
            String [] parts = badRequestException.getMessage().split(":");
            ErrorMessage em = new ErrorMessage();
            em.setCode(parts[0]);
            em.setMessage(parts[1]);

            LOGGER.error(ERR_LOG_FORMAT, em.getCode(), em.getMessage());
            return Response.status(badRequestException.getResponse().getStatus()).entity(em).build();

        } else if (exception instanceof WebApplicationException) {
            WebApplicationException webApplicationException = (WebApplicationException) exception;
            ErrorMessage em = new ErrorMessage();
            em.setCode(webApplicationException.getResponse().getStatus() + "");
            em.setMessage(webApplicationException.getMessage());

            LOGGER.error(ERR_LOG_FORMAT, em.getCode(), em.getMessage());
            return Response.status(webApplicationException.getResponse().getStatus()).entity(em).build();

        }  else if(exception instanceof DataIntegrityViolationException){
            DataIntegrityViolationException dataIntExcp = (DataIntegrityViolationException) exception;


            ErrorMessage em = new ErrorMessage();
            em.setCode("SAVE_ERROR");
            em.setMessage(dataIntExcp.getRootCause().getMessage());

            LOGGER.error(ERR_LOG_FORMAT, em.getCode(), em.getMessage());
            return Response.status(Response.Status.BAD_REQUEST.getStatusCode()).entity(em).build();
        } else {

            ErrorMessage em = new ErrorMessage();
            em.setCode(ErrorEnum.GLOBAL_500_ERROR_CODE.getErrorValue());
            em.setMessage(ErrorEnum.GLOBAL_500_ERROR_DESCRIPTION.getErrorValue() + " : We apologize for the inconvenience.");

            LOGGER.error(ERR_LOG_FORMAT + " : {}", em.getCode(), exception.getClass().getName(), exception.getMessage());
            LOGGER.error("{0}", exception);
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode()).entity(em).build();
        }

    }
}
