package org.sanchez.corcoles.ana.pruebasconcepto.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@RibbonClient(name = "servicio-productos")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
