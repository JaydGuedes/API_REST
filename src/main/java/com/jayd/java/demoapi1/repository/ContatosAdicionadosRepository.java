package com.jayd.java.demoapi1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jayd.java.demoapi1.model.ContatosAdicionados;
@Repository
public interface ContatosAdicionadosRepository extends JpaRepository<ContatosAdicionados, Long> {
	@Query(value = "SELECT * FROM CONTATOS_ADICIONADOS WHERE CONT_USER_ID_PRIMARY  = :user1",nativeQuery = true)
	List <ContatosAdicionados> listaCont(@Param ("user1") Long user);
	
	@Query(value = "SELECT * FROM CONTATOS_ADICIONADOS WHERE CONT_USER_ID_PRIMARY  = :user AND CONT_USER_ID_CONTATO  = :contato",nativeQuery = true)
	Long existId(@Param ("user") Long user, @Param ("contato") Long contato);
	
	@Query(value = "INSERT INTO CONTATOS_ADICIONADOS  (CONT_USER_ID_PRIMARY , CONT_USER_ID_CONTATO )VALUES (:user, :contato)",nativeQuery = true)
	Long addCont(@Param ("user") Long user, @Param ("contato") Long contato);
}
