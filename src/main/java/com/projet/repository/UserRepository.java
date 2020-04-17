/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.repository;

import com.projet.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author KHALID
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{

    Optional<User> findByUserName(String username);
    
}