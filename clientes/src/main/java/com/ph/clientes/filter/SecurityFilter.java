package com.ph.clientes.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //Indica a configuração
@EnableWebSecurity //Desabilitada a segurança web
public class SecurityFilter {

    @Bean // Indique um conjunto de permissões
    public SecurityFilterChain securityFilterChain(HttpSecurity http){
        return http.csrf(csrf -> csrf.disable())
                .sessionManagement( session ->
                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(auth ->
                        auth.requestMatchers(HttpMethod.GET, "/clientes").permitAll()
                                .requestMatchers(HttpMethod.POST, "/clientes").permitAll()
                                .requestMatchers(HttpMethod.GET, "/clientes/**").permitAll()
                                .requestMatchers(HttpMethod.DELETE, "/clientes/**").permitAll()
                                .requestMatchers(HttpMethod.PUT, "/clientes/**").permitAll()

                )
                .build();
    }

}
