package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;

public class Teste {
	
	public static void main(String[] args) {
		
		//gerencia as entidades do projeto, pede o nome pois pode ter mais de uma persistencia.
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities");
		EntityManager em = fabrica.createEntityManager();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Xptozada");
		
		try {
		em.persist(cliente);
		//sempre iniciar uma transação
		em.getTransaction().begin();
		em.getTransaction().commit();
		}catch(Exception e) {
			if(em.getTransaction().isActive()) {
				//poderia ter vários comandos, então o rollback desfaz
				em.getTransaction().rollback();
			}
		}
		
		
		em.close();
		fabrica.close();
		
	}

}
