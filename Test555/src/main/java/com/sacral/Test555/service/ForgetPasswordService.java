package com.sacral.Test555.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.Test555.model.ForgetPasswordServiceImpl;
import com.sacral.Test555.repository.ForgetPasswordServiceImplRepository;

@Service
public class ForgetPasswordService {

    @Autowired
    ForgetPasswordServiceImplRepository forgetPasswordServiceImplRepository;

    public ForgetPasswordServiceImpl findByUsername(String username) {
        return forgetPasswordServiceImplRepository.findByUsername(username);
    }

    public ForgetPasswordServiceImpl findByEmail(String email) {
        return forgetPasswordServiceImplRepository.findByEmail(email);
    }

    public ForgetPasswordServiceImpl findByOtp(String otp) {
        return forgetPasswordServiceImplRepository.findByOtp(otp);
    }

    public ForgetPasswordServiceImpl save(ForgetPasswordServiceImpl forgetPasswordServiceImpl) {
        return forgetPasswordServiceImplRepository.save(forgetPasswordServiceImpl);
    }

}