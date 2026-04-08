package com.example.security_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // 스프링의 설정 정보(Bean 정의)를 담고 있음
public class SecurityConfing {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

    }
}
