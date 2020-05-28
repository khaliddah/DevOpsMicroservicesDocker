/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projet.dto.LoginRequest;
import com.projet.dto.RegisterRequest;
import com.projet.service.AuthService;
import org.hibernate.boot.jaxb.Origin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 *
 * @author KHALID
 */

@RestController
@RequestMapping("api/auth")
@CrossOrigin(origins ={"localhost:4200"})
public class AuthController {
    
    @Autowired
    private AuthService authService;
    
    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody RegisterRequest registerRequest){
        authService.signup(registerRequest);
        return new ResponseEntity(HttpStatus.OK);
    }
    @PostMapping("/login")
    public HashMap<String, String> login(@RequestBody LoginRequest loginRequest){

        return authService.login(loginRequest);
    }
}

