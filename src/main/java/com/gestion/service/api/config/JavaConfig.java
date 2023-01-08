package com.gestion.service.api.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public DozerBeanMapper dozerBeanInit ()
    {
        return new DozerBeanMapper();
    }
}
