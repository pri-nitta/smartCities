package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_usuario")
public class Usuario {
	
	@Id
	@SequenceGenerator(name ="usuario", sequenceName="sq_tb_usuario", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="usuario")
	@Column(name="id_usuario")
	private int id;
	
	@Column(name="nm_login", nullable=false, length=100)
	private String login;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Usuario(int id, String login) {
		super();
		this.id = id;
		this.login = login;
	}
	
	public Usuario() {
		super();
	}

}
