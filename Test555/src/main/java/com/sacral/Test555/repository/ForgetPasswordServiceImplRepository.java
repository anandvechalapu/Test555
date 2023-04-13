package com.sacral.Test555.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sacral.Test555.model.ForgetPasswordServiceImpl;

public interface ForgetPasswordServiceImplRepository extends JpaRepository<ForgetPasswordServiceImpl, Long> {

    ForgetPasswordServiceImpl findByUsername(String username);

    ForgetPasswordServiceImpl findByEmail(String email);

    ForgetPasswordServiceImpl findByOtp(String otp);

    ForgetPasswordServiceImpl save(ForgetPasswordServiceImpl forgetPasswordServiceImpl);

}