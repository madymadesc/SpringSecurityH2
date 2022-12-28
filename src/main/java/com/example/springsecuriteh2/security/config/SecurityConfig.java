package com.example.springsecuriteh2.security.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration auth) throws Exception {
        return auth.getAuthenticationManager();
    }
    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception{
         http
                .csrf().disable().cors().and()
                 .headers().frameOptions().disable().and()
                 .formLogin().and()
                 .authorizeHttpRequests().anyRequest().authenticated();
        return http.build();
    }
}
