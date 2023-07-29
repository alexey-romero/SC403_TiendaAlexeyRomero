package com.tienda.service;

import org.springframework.security.core.userdetails.*;

public interface IUsuarioService {
    public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException;
}