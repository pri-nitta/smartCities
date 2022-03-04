package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_contrato")
public class Contrato {

	@Id
	@Column(name="id_contrato")
	private int id;
	
	@Column(name="vl_aluguel")
	private double aluguel;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_vencimento_aluguel")
	private Calendar dataVencimento;
	
	@OneToOne
	private Estabelecimento estabelecimento;

	public int getId() {
		return id;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAluguel() {
		return aluguel;
	}

	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}

	public Calendar getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Calendar dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Contrato(int id, double aluguel, Calendar dataVencimento) {
		super();
		this.id = id;
		this.aluguel = aluguel;
		this.dataVencimento = dataVencimento;
	}
	
	
	
}
