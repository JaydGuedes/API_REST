package com.jayd.java.demoapi1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jayd.java.demoapi1.model.Mensagens;
@Repository
public interface MensagensRepository extends JpaRepository<Mensagens, Long> {
	
	@Query(value = "SELECT * FROM MENSAGENS where MENS_CONT_ID = :user1 and MENS_USER_ID = :user2",nativeQuery = true)
	List <Mensagens> conversa(@Param ("user1") Long user1, @Param ("user2") Long user2);
	
	@Query(value = "SELECT * FROM MENSAGENS where MENS_CONT_ID = :user1 and MENS_USER_ID = :user2",nativeQuery = true)
	Mensagens sendMensage(@Param ("user1") Long user1, @Param ("user2") Long user2);
	
	@Query(value = "INSERT INTO MENSAGENS   (MENS_DATA, MENS_MENSAGEM, MENS_STATUS, MENS_USER_ID_CONTATO, MENS_USER_ID_PRIMARY) VALUES (:mData, :mMensagem, :mStatus, :mContato, :mUser)",nativeQuery = true)
	Mensagens addMensage(@Param ("mData") String mData, @Param ("mMensagem") String mMensagem, @Param ("mStatus") String mStatus, @Param ("mContato") Long mContato, @Param ("mUser") Long mUser);

	@Modifying
	@Query(value = "UPDATE articles SET views = views + 1 WHERE  AND id = :id", nativeQuery = true)
	void updateViews(@Param("id") Long id);
}
