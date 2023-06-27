package com.jayd.java.demoapi1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jayd.java.demoapi1.model.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	@Query(value = "SELECT * FROM USUARIO WHERE USER_NOME  LIKE '%:nome%' OR USER_EMAIL LIKE '%:nome%'",nativeQuery = true)
	List <Usuario> listaPAdd(@Param ("nome") String nome);
}
