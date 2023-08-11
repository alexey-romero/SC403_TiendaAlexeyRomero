package com.tienda.db;

import com.tienda.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  IUserRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
    Usuario findByUsernameAndPassword(String username, String Password);
    Usuario findByUsernameOrCorreo(String username, String correo);
    boolean existsByUsernameOrCorreo(String username, String correo);
}