package com.jayd.java.demoapi1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jayd.java.demoapi1.model.Mensagens;
@Repository
public interface MensagensRepository extends JpaRepository<Mensagens, Long> {
	
	@Query(value = "SELECT * FROM MENSAGENS where MENS_CONT_ID = :user1 and MENS_USER_ID = :user2",nativeQuery = true)
	List <Mensagens> conversa(@Param ("user1") Long user1, @Param ("user2") Long user2);

}
