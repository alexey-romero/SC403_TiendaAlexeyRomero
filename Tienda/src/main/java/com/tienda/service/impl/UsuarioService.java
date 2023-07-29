package com.tienda.service.impl;

import com.tienda.service.IUsuarioService;
import com.tienda.db.IUsuarioRepository;
import com.tienda.entities.Usuario;
import com.tienda.entities.Rol;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@Service("userDetailsService")
//public class UsuarioService implements IUsuarioRepository, UserDetailsService {
//    @Autowired
//    private Usuario usuarioDetails;
//    @Autowired
//    private HttpSession session;
//
//    @Override
//    @Transactional(readOnly = true)
//    public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException {
//        // Busca el usuario por el username en la tabla
//        Usuario usuario = usuarioDetails.findByUsername(username);
//        // Si no existe el usuario, lanza una excepcion
//        if (usuario == null) {
//            throw new UsernameNotFoundException(username);
//        }
//        session.removeAttribute("usuarioImagen");
//        session.setAttribute("usuarioImagen", usuario.getRutaImagen());
//        // Si esta aca es porque existe el usuario, sacamos los roles que tiene
//        var roles = new ArrayList<GrantedAuthority>();
//        for (Rol rol : usuario.getRoles()) { // Se sacan los roles
//            roles.add(new SimpleGrantedAuthority(rol.getNombre()));
//        }
//        return new User(usuario.getUsername(), usuario.getPassword(), roles);
//    }
//}

public class UsuarioService {

}