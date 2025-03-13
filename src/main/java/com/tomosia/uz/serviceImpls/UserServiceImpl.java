package com.tomosia.uz.serviceImpls;

import org.springframework.stereotype.Service;

import com.tomosia.uz.repository.UserRepository;
import com.tomosia.uz.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
