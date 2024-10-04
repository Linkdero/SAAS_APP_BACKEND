package com.saas.SAAS_APP_BACKEND.controller.WEBSOCKET;

import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {
    @MessageMapping("/validar-sesion")
    @SendTo("/topic/auth-status")
    public ResponseEntity<Boolean> validateSession() {
        boolean isAuthenticated = SecurityContextHolder.getContext().getAuthentication() != null &&
                SecurityContextHolder.getContext().getAuthentication().isAuthenticated();

        return ResponseEntity.ok(isAuthenticated);
    }
}
