package com.jayd.java.demoapi1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Mensagens {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long mensId;

	@Column(length = 255)
	private Long contId;

	@Column(length = 255)
	private Long userId;

	@Column(length = 500)
	private String mensMensagem;

	@Column(length = 5)
	private String mensStatus;

	@Temporal(TemporalType.TIMESTAMP)
	private String mensData;

	public Long getMensId() {
		return mensId;
	}

	public void setMensId(Long mensId) {
		this.mensId = mensId;
	}

	public Long getContId() {
		return contId;
	}

	public void setContId(Long contId) {
		this.contId = contId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getMensMensagem() {
		return mensMensagem;
	}

	public void setMensMensagem(String mensMensagem) {
		this.mensMensagem = mensMensagem;
	}

	public String getMensStatus() {
		return mensStatus;
	}

	public void setMensStatus(String mensStatus) {
		this.mensStatus = mensStatus;
	}

	public String getMensData() {
		return mensData;
	}

	public void setMensData(String mensData) {
		this.mensData = mensData;
	}

}
