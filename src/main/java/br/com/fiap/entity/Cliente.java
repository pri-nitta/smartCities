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
	
}
