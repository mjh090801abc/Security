package com.example.security_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // 스프링의 설정 정보(Bean 정의)를 담고 있음
public class SecurityConfing {
    @Bean// 이 메서드가 생성해서 반환하는 객체를 스프링 컨테이너가 관리하는 공용 객체(Bean)로 등록
    // SecurityFilterChain : 반환 타입(보안 필터 체인이라는 객체를 반환)
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

    }
}
