package com.tienda.db;

import com.tienda.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRolRepository extends JpaRepository <Rol, Long> { }