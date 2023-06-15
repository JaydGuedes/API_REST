package com.jayd.java.demoapi1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayd.java.demoapi1.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
