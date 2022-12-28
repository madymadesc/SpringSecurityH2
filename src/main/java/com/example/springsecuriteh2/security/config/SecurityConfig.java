package com.example.springsecuriteh2.security.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {


    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception{
         http
                .csrf().disable().cors().and()
                 .headers().frameOptions().disable().and()
                 .authorizeHttpRequests().anyRequest().permitAll();
        return http.build();
    }
}
