package com.sacral.Test555.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.Test555.model.CustomWorkout;
import com.sacral.Test555.repository.CustomWorkoutRepository;

@Service
public class CustomWorkoutService {
    
    @Autowired
    private CustomWorkoutRepository customWorkoutRepository;

    public CustomWorkout findByName(String name) {
        return customWorkoutRepository.findByName(name);
    }

    public CustomWorkout findById(Long id) {
        return customWorkoutRepository.findById(id);
    }

    public void deleteByName(String name) {
        customWorkoutRepository.deleteByName(name);
    }

    public void deleteById(Long id) {
        customWorkoutRepository.deleteById(id);
    }

    public CustomWorkout save(CustomWorkout customWorkout) {
        return customWorkoutRepository.save(customWorkout);
    }

    public CustomWorkout update(CustomWorkout customWorkout) {
        return customWorkoutRepository.save(customWorkout);
    }
}