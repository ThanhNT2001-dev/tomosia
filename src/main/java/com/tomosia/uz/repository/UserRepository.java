package com.tomosia.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tomosia.uz.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
    
}
