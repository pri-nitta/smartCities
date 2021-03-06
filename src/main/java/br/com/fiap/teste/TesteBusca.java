package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;

public class TesteBusca {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities");
		EntityManager em = fabrica.createEntityManager();

//		Busca
		Cliente cliente = em.find(Cliente.class, 1);
		
		//desanexado, substitui
//		Cliente cliente = new Cliente(1, "Thiago");
			
		System.out.println(cliente.getId() + " " + cliente.getNome());

		em.merge(cliente);

		// atualização
//		cliente.setNome("Henrique");

		em.getTransaction().begin();
		em.getTransaction().commit();

		em.close();
		fabrica.close();

	}

}
