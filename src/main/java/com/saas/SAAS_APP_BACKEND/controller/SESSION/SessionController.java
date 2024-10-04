package com.saas.SAAS_APP_BACKEND.controller.SESSION;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sesion")
public class SessionController {

    @GetMapping("/validar-sesion")
    public ResponseEntity<Boolean> validateSession() {
        boolean isAuthenticated = SecurityContextHolder.getContext().getAuthentication() != null &&
                SecurityContextHolder.getContext().getAuthentication().isAuthenticated();

        return ResponseEntity.ok(isAuthenticated);
    }
} 