package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy="tipo")
	private List<Estabelecimento> estabelecimentos;

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

	public List<Estabelecimento> getEstabelecimentos() {
		return estabelecimentos;
	}

	public void setEstabelecimentos(List<Estabelecimento> estabelecimentos) {
		this.estabelecimentos = estabelecimentos;
	}

	public TipoEstabelecimento(int id, String nome, List<Estabelecimento> estabelecimentos) {
		super();
		this.id = id;
		this.nome = nome;
		this.estabelecimentos = estabelecimentos;
	}

	public TipoEstabelecimento() {
		super();
	}
	
	

}
