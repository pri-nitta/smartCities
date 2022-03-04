package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_tipo_estabelecimento")
public class TipoEstabelecimento {
	
	@Id
	@SequenceGenerator(name ="tipo_estabelecimento", sequenceName="sq_tb_tipo_estabelecimento", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="tipo_estabelecimento")
	@Column(name="id_tipo_estabelecimento")
	private int id;
	
	@Column(name="nm_tipo_estabelecimento", nullable=false, length=100)
	private String nome;

}
