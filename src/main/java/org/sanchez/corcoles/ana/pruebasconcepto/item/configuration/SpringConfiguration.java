package org.sanchez.corcoles.ana.pruebasconcepto.item.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SpringConfiguration {

    @Bean("clienteRest")
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
