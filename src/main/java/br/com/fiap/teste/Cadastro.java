package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.ContratoAluguel;
import br.com.fiap.entity.Estabelecimento;
import br.com.fiap.entity.TipoEstabelecimento;

public class Cadastro {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("smartcities").createEntityManager();
		
		TipoEstabelecimento tipo = new TipoEstabelecimento(0, "Petshop", null);
		
		Cliente cliente = new Cliente(0, "Thiago", "12345678910", "t@email.com", "99999999999", null, null, null, null, null, null, 0, null);
		Cliente cliente2 = new Cliente(0, "Leandro", "12345678911", "l@email.com", "99999999991", null, null, null, null, null, null, 0, null);
		
		List<Cliente> lista = new ArrayList<Cliente>();
		lista.add(cliente);
		lista.add(cliente2);
		
		ContratoAluguel contrato = new ContratoAluguel(1, 2000, new GregorianCalendar(2015, Calendar.MARCH, 04), null);
		
		Estabelecimento est1 = new Estabelecimento(0, "Fiap pet", lista, null, tipo);
		Estabelecimento est2 = new Estabelecimento(0, "Poyatos dog", lista, contrato, tipo);
		
		contrato.setEstabelecimento(est2);

		em.persist(est1);
		em.persist(est2);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();

	}

}
