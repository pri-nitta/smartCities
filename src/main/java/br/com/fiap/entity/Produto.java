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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_produto")
public class Produto {
	
	@Id
	@SequenceGenerator(name ="produto", sequenceName="sq_tb_produto", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="produto")
	@Column(name="cd_produto")
	private int id;
	
	@Column(name="nm_produto", nullable=false, length=100)
	private String nome;
	
	@Column(name="vl_preco")
	private double preco;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_validade")
	private Calendar dataValidade;
	
	@Enumerated(EnumType.STRING)
	private Estado estado;
	
}
