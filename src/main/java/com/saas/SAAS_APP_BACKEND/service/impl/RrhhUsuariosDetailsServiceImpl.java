package com.saas.SAAS_APP_BACKEND.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;

import com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH.RrhhSecurityUsuarios;
import com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH.RrhhUsuarios;
import com.saas.SAAS_APP_BACKEND.repository.SAAS_APP.RRHH.RrhhSecurityUsuariosRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RrhhUsuariosDetailsServiceImpl implements UserDetailsService{
    private RrhhSecurityUsuariosRepository rrhhSecurityUsuariosRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        RrhhUsuarios rrhhUsuarios = rrhhSecurityUsuariosRepository.findByUsername(username);
        if (rrhhUsuarios == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new RrhhSecurityUsuarios(rrhhUsuarios);
    }
}
