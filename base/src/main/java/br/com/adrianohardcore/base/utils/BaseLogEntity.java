package br.com.adrianohardcore.base.utils;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.data.jpa.domain.AbstractPersistable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class BaseLogEntity {

	@Column(name = "datacriacao", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao;

	@Column(name = "datalteracao", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAlteracao;

	@Column(name = "id_usuariocriacao", nullable = true)
	private UserEntity idUsuarioCriacao;

	@Column(name = "id_usuarioalteracao", nullable = true)
	private UserEntity idUsuarioAlteracao;

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public UserEntity getIdUsuarioCriacao() {
		return idUsuarioCriacao;
	}

	public void setIdUsuarioCriacao(UserEntity idUsuarioCriacao) {
		this.idUsuarioCriacao = idUsuarioCriacao;
	}

	public UserEntity getIdUsuarioAlteracao() {
		return idUsuarioAlteracao;
	}

	public void setIdUsuarioAlteracao(UserEntity idUsuarioAlteracao) {
		this.idUsuarioAlteracao = idUsuarioAlteracao;
	}
}
