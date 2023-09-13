package tech.rshubhankar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class BBankApplication {

    public static void main(String[] args) {

        SpringApplication.run(BBankApplication.class, args);
    }

}
