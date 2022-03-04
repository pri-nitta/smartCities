package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_estabelecimento")
public class Estabelecimento {
	
	@Id
	@SequenceGenerator(name ="estabelecimento", sequenceName="sq_tb_estabelecimento", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="estabelecimento")
	@Column(name="id_estabelecimento")
	private int id;
	
	@Column(name="nm_estabelecimento", nullable=false, length=100)
	private String nome;


}
