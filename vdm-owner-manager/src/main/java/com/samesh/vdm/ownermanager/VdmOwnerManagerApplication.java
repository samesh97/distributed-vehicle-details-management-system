package com.samesh.vdm.ownermanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "owner")
@EnableEurekaClient
public class VdmOwnerManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VdmOwnerManagerApplication.class, args);
    }

}
