package com.tienda.service;

import com.tienda.entities.Usuario;
import java.util.List;
import org.springframework.security.core.userdetails.*;

public interface IUsuarioService {
    public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException;

    public Usuario getUsuarioPorUsernameYPassword(String username, String clave);

    public boolean existeUsuarioPorUsernameOCorreo(String username, String correo);

    public void save(Usuario usuario, boolean b);

    public Usuario getUsuarioPorUsernameOCorreo(String username, String correo);

    public Usuario getUsuario(Usuario usuario);

    public void delete(Usuario usuario);
    
    public List<Usuario> getUsuarios();
}