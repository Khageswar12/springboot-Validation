package com.validation.springbootValidation.Service;

import com.validation.springbootValidation.Model.User;
import com.validation.springbootValidation.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;//field Injection

    public User createUser(User user){
        return userRepository.save(user);
    }
}
