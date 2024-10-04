package com.saas.SAAS_APP_BACKEND.config;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(AbstractHttpConfigurer::disable) // Desactivar CSRF
                .cors(Customizer.withDefaults()) // Habilitar CORS
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/sesion/validar-sesion").authenticated()
                        .requestMatchers("/validarLogin/**").permitAll()
                        .requestMatchers("/ws/**").authenticated()
                        .requestMatchers("/login?logout").permitAll() 
                        .requestMatchers("/logout").permitAll()
                        .requestMatchers("/gym/**").authenticated()
                        .requestMatchers("/rrhh/usuarios", "/rrhh/ficha/**", "/rrhh/fotografias/**").permitAll()
                        .requestMatchers("/v1/home").authenticated()
                        .requestMatchers("/v1/admin").hasAuthority("ADMIN")
                        .anyRequest().authenticated())
                .exceptionHandling(exceptions -> exceptions
                        .authenticationEntryPoint(new AuthenticationEntryPoint() {
                            @Override
                            public void commence(HttpServletRequest request,
                                    HttpServletResponse response,
                                    org.springframework.security.core.AuthenticationException authException)
                                    throws IOException {
                                response.setContentType("application/json");
                                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                                response.getWriter().write("{\"authenticated\": false}");
                            }
                        }))
                .formLogin(Customizer.withDefaults()) // Desactivar el inicio de sesión por defecto
                .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("http://localhost:5173", "http://172.16.1.18:5173"));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        configuration.setAllowedHeaders(Arrays.asList("Authorization", "Content-Type"));
        configuration.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}