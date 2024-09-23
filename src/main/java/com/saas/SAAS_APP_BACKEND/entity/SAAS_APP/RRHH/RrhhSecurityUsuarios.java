package com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH;

import java.util.Collection;
import java.util.Collections; 

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class RrhhSecurityUsuarios implements UserDetails {
    private RrhhUsuarios rrhhUsuarios;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority(rrhhUsuarios.getRole()));
    }

    @Override
    public String getPassword() {
        return rrhhUsuarios.getPassword();
    }

    @Override
    public String getUsername() {
        return rrhhUsuarios.getUsername();
    }
}