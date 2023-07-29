package com.tienda.db;

import com.tienda.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {
    Usuario findByUsername (String username);
}