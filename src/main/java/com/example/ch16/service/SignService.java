package com.example.ch16.service;

import com.example.ch16.dto.SignInResultDto;
import com.example.ch16.dto.SignUpResultDto;

public interface SignService {

    SignUpResultDto signUp(String id, String password, String name, String email, String role);

    SignInResultDto signIn(String id, String password) throws RuntimeException;

}
