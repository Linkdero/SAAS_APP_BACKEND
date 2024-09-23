// package com.saas.SAAS_APP_BACKEND.service.impl;

// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;

// import com.saas.SAAS_APP_BACKEND.entity.GYM.GymSecurityUsuarios;
// import com.saas.SAAS_APP_BACKEND.entity.GYM.GymUsuarios;
// import com.saas.SAAS_APP_BACKEND.repository.GYM.GymSecurityUsuariosRepository;

// import lombok.AllArgsConstructor;

// @Service
// @AllArgsConstructor
// public class GymUsuariosDetailsServiceImpl implements UserDetailsService {
//     private GymSecurityUsuariosRepository gymSecurityUsuariosRepository;

//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         GymUsuarios gymUsuarios = gymSecurityUsuariosRepository.findByUsername(username);
//         if (gymUsuarios == null) {
//             throw new UsernameNotFoundException("User not found");
//         } 
//         return new GymSecurityUsuarios(gymUsuarios);
//     }
// }
