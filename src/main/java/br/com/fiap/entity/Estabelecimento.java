package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(joinColumns=@JoinColumn(name="id_estabelecimento"), inverseJoinColumns=@JoinColumn(name="id_cliente"), name="tb_cliente_estabelecimento")
	private List<Cliente> clientes;
	
	//Evita a criação de 2 FK
	@OneToOne(mappedBy="estabelecimento", cascade=CascadeType.PERSIST)
	private ContratoAluguel contratoAluguel;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name= "id_tipo_estabelecimento")
	private TipoEstabelecimento tipo;
	

	public ContratoAluguel getContratoAluguel() {
		return contratoAluguel;
	}

	public void setContratoAluguel(ContratoAluguel contratoAluguel) {
		this.contratoAluguel = contratoAluguel;
	}

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

	public Estabelecimento(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Estabelecimento() {
		super();
	}

	public TipoEstabelecimento getTipo() {
		return tipo;
	}

	public void setTipo(TipoEstabelecimento tipo) {
		this.tipo = tipo;
	}

	public Estabelecimento(int id, String nome, List<Cliente> clientes, ContratoAluguel contratoAluguel,
			TipoEstabelecimento tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.clientes = clientes;
		this.contratoAluguel = contratoAluguel;
		this.tipo = tipo;
	}
}
