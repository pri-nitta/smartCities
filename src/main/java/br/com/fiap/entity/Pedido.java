package br.com.fiap.entity;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="tb_pedido")
public class Pedido {
	
	@Id
	@SequenceGenerator(name ="pedido", sequenceName="sq_tb_pedido", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pedido")
	@Column(name="cd_pedido")
	private int id;
	
	@Column(name="nr_nota_fiscal")
	private int notaFiscal;
	
	@Column(name="cd_cliente")
	private int idCliente;
	
	@Column(name="cd_produto")
	private int idProduto;
	
	@Column(name="qt_produto")
	private int quantidade;
	
	@Column(name="vl_preco")
	private double preco;

	@CreationTimestamp
	@Column(name="dt_pedido")
	private Calendar dataPedido;
}
