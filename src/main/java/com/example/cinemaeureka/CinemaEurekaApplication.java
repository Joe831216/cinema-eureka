package com.example.cinemaeureka;

import com.soselab.vmamveurekaclient.annotation.EnableVmamvRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@EnableVmamvRegister
@SpringBootApplication
public class CinemaEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinemaEurekaApplication.class, args);
    }

}
