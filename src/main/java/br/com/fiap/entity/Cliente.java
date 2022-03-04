package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="tb_cliente")
public class Cliente {
	
	@Id
	@SequenceGenerator(name="cliente", sequenceName="sq_tb_cliente", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente")
	private int id;
	
	@Column(name="nm_cliente", nullable=false, length=60)
	private String nome;
	
	@Column(name="nr_cpf", nullable=false, length=11)
	private String cpf;
	
	@Column(name="ds_email", nullable=false, length=11)
	private String email;
	
	@Column(name="nr_celular", nullable=false, length=11)
	private String celular;
	
	@Column(name="nm_logradouro")
	private String logradouro;
	
	@Column(name="nr_endereco")
	private String numero;
	
	@Column(name="nm_bairro")
	private String bairro;
	
	@Column(name="ds_complemento")
	private String complemento;
	
	@Column(name="nm_cidade")
	private String cidade;
	
	@Enumerated(EnumType.STRING)
	private Uf estado;
	
	@Column(name="nr_cep", length=8)
	private int cep;
	
	@CreationTimestamp
	@Column(name="dt_cadastro")
	private Calendar dataCadastro;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Uf getEstado() {
		return estado;
	}

	public void setEstado(Uf estado) {
		this.estado = estado;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Cliente(int id, String nome, String cpf, String email, String celular, String logradouro, String numero,
			String bairro, String complemento, String cidade, Uf estado, int cep, Calendar dataCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.celular = celular;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.dataCadastro = dataCadastro;
	}

	public Cliente() {
	}
}
