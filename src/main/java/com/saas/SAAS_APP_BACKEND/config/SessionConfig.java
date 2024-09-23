package com.saas.SAAS_APP_BACKEND.config;

import org.springframework.boot.web.server.Cookie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.DefaultCookieSerializer;

@Configuration
public class SessionConfig {

    @Bean
    public CookieSerializer cookieSerializer() {
        DefaultCookieSerializer cookieSerializer = new DefaultCookieSerializer();
        cookieSerializer.setCookieName("JSESSIONID"); // Nombre de la cookie de sesión
        cookieSerializer.setCookieMaxAge(Integer.MAX_VALUE); // Establece la duración máxima permitida (en segundos)
        cookieSerializer.setUseHttpOnlyCookie(true); // Para mayor seguridad
        cookieSerializer.setSameSite("Strict"); // Configuración SameSite para la cookie
        return cookieSerializer;
    }

    @Bean
    public Cookie.SameSite sessionCookieConfig() {
        return Cookie.SameSite.STRICT;  // Configurar la política SameSite
    }
} 