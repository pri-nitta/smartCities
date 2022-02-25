package br.com.fiap.teste;

import javax.persistence.Persistence;

public class Teste {
	
	public static void main(String[] args) {
		
		//gerencia as entidades do projeto, pede o nome pois pode ter mais de uma persistencia.
		Persistence.createEntityManagerFactory("smartcities").createEntityManager();
		
	}

}
