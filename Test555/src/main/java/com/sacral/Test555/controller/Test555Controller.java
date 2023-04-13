package com.sacral.Test555.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.Test555.model.CustomWorkout;
import com.sacral.Test555.model.ForgetPasswordServiceImpl;
import com.sacral.Test555.service.CustomWorkoutService;
import com.sacral.Test555.service.ForgetPasswordService;

@RestController
@RequestMapping("/api")
public class Test555Controller {

    @Autowired
    CustomWorkoutService customWorkoutService;

    @Autowired
    ForgetPasswordService forgetPasswordService;

    @GetMapping("/workouts/{name}")
    public CustomWorkout getCustomWorkoutByName(@PathVariable String name) {
        return customWorkoutService.findByName(name);
    }

    @GetMapping("/workouts/{id}")
    public CustomWorkout getCustomWorkoutById(@PathVariable Long id) {
        return customWorkoutService.findById(id);
    }

    @DeleteMapping("/workouts/{name}")
    public void deleteCustomWorkoutByName(@PathVariable String name) {
        customWorkoutService.deleteByName(name);
    }

    @DeleteMapping("/workouts/{id}")
    public void deleteCustomWorkoutById(@PathVariable Long id) {
        customWorkoutService.deleteById(id);
    }

    @PostMapping("/workouts")
    public CustomWorkout saveCustomWorkout(@RequestBody CustomWorkout customWorkout) {
        return customWorkoutService.save(customWorkout);
    }

    @PutMapping("/workouts")
    public CustomWorkout updateCustomWorkout(@RequestBody CustomWorkout customWorkout) {
        return customWorkoutService.update(customWorkout);
    }

    @GetMapping("/forgetpassword/{username}")
    public ForgetPasswordServiceImpl getPasswordByUsername(@PathVariable String username) {
        return forgetPasswordService.findByUsername(username);
    }

    @GetMapping("/forgetpassword/{email}")
    public ForgetPasswordServiceImpl getPasswordByEmail(@PathVariable String email) {
        return forgetPasswordService.findByEmail(email);
    }

    @GetMapping("/forgetpassword/{otp}")
    public ForgetPasswordServiceImpl getPasswordByOtp(@PathVariable String otp) {
        return forgetPasswordService.findByOtp(otp);
    }

    @PostMapping("/forgetpassword")
    public ForgetPasswordServiceImpl saveForgetPassword(@RequestBody ForgetPasswordServiceImpl forgetPasswordServiceImpl) {
        return forgetPasswordService.save(forgetPasswordServiceImpl);
    }

}