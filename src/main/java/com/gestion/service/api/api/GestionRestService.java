package com.gestion.service.api.api;

import com.gestion.service.api.to.MessageTo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/gestion")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface GestionRestService {
    @GET
    @Path("/message")
    MessageTo getMessage();
}
