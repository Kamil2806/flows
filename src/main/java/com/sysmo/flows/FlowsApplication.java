package com.sysmo.flows;

import com.sysmo.flows.security.model.User;
import com.sysmo.flows.security.service.UserServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FlowsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowsApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserServiceImpl userService) {
        return (args) -> {
            User user = new User();
            user.setUsername("KamilS");
            user.setPassword("Password");
            userService.save(user);
        };
    }

}
