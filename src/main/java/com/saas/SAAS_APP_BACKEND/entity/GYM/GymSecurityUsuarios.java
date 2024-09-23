// package com.saas.SAAS_APP_BACKEND.entity.GYM;

// import lombok.AllArgsConstructor;
// import lombok.NoArgsConstructor;
// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.UserDetails;

// import java.util.Collection;
// import java.util.Collections; 

// @AllArgsConstructor
// @NoArgsConstructor
// public class GymSecurityUsuarios implements UserDetails{
//     private GymUsuarios gymUsuarios;

//     @Override
//     public Collection<? extends GrantedAuthority> getAuthorities() {
//         return Collections.singletonList(new SimpleGrantedAuthority(gymUsuarios.getRole()));
//     }

//     @Override
//     public String getPassword() {
//         return gymUsuarios.getPassword();
//     }

//     @Override
//     public String getUsername() {
//         return gymUsuarios.getUsername();
//     }
// }
