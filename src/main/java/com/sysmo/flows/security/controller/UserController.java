package com.sysmo.flows.security.controller;

import com.sysmo.flows.security.service.SecurityService;
import com.sysmo.flows.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;
    private final SecurityService securityService;

    @Autowired
    public UserController(UserService userService, SecurityService securityService) {
        this.userService = userService;
        this.securityService = securityService;
    }

    @GetMapping("/user")
    public String GetUser() {
        String user = "user";
        return user;
    }


}
