package com.jayd.java.demoapi1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class ContatosAdicionados {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long contId;

	@Column(length = 255)
	private String contNome;

	@Column(length = 255)
	private String contEmail;

	@Column(length = 255)
	private Long userId;

	public Long getContId() {
		return contId;
	}

	public void setContId(Long contId) {
		this.contId = contId;
	}

	public String getContNome() {
		return contNome;
	}

	public void setContNome(String contNome) {
		this.contNome = contNome;
	}

	public String getContEmail() {
		return contEmail;
	}

	public void setContEmail(String contEmail) {
		this.contEmail = contEmail;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
