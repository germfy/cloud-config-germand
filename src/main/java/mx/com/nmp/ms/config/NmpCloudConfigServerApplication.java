package mx.com.nmp.ms.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Clase de inicio Spring Boot.
 * Activa Spring Cloud Config Server
 *
 * @author osanchez@quarksoft.net
 */
@SpringBootApplication
@EnableConfigServer
public class NmpCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NmpCloudConfigServerApplication.class, args);
    }
}
