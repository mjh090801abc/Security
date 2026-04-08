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
        http
                // .authorizeHttpRequests() : HTTP 요청에 대한 인가(Authorization) 규칙을 설정할 때 사용하는 핵심 메서드
                .authorizeHttpRequests(auth -> auth
                        // .requestMatchers() : 특정 경로를 지정
                        .requestMatchers("/").permitAll()
                        // "/user" URL로 시작하면 인증된 사용자만 들어올 수 있음
                        // authenticated() : 인증된 사용자만 허가
                        .requestMatchers("/user").authenticated()
                        // 위에 URL을 제외한 나머지 URL은 제약 조건 없이 허가
                        .anyRequest().permitAll()
                )
                // 폼(Form) 기반 로그인 방식을 사용
                .formLogin(form -> form
                        .permitAll()
                );
    }
}
