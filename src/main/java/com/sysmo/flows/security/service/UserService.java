package com.sysmo.flows.security.service;

import com.sysmo.flows.security.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
