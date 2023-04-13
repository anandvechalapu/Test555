package com.sacral.Test555.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sacral.Test555.model.CustomWorkout;

@Repository
public interface CustomWorkoutRepository extends JpaRepository<CustomWorkout, Long> {

    CustomWorkout findByName(String name);
    CustomWorkout findById(Long id);
    void deleteByName(String name);
    void deleteById(Long id);
    CustomWorkout save(CustomWorkout customWorkout);
    CustomWorkout update(CustomWorkout customWorkout);
}