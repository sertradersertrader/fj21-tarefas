package br.com.caelum.tarefas.jfa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefa;

public class CarregaTarefa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		Tarefa encontrada = manager.find(Tarefa.class, 2L);
		System.out.println(encontrada.getDescricao());
		manager.close();

	}

}
