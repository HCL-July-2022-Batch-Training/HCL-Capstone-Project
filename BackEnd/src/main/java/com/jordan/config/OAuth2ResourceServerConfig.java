//package com.jordan.config;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.oauth2.jwt.JwtDecoder;
//import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
// @EnableWebSecurity
// public class OAuth2ResourceServerConfig {
//
//        @Bean
//        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//                http
//                        .authorizeRequests((authorizeRequests) ->
//                                authorizeRequests
//                                        .anyRequest().authenticated()
//                        )
//                        .oauth2ResourceServer((oauth2ResourceServer) ->
//                                oauth2ResourceServer
//                                        .jwt((jwt) ->
//                                                jwt
//                                                        .decoder(jwtDecoder())
//                                        )
//                        );
//                return http.build();
//        }
//
//        @Bean
//        public JwtDecoder jwtDecoder() {
//                return NimbusJwtDecoder.withPublicKey(this.key).build();
//        }
// }