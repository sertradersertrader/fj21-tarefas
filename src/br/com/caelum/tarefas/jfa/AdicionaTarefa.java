package br.com.caelum.tarefas.jfa;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefa;

public class AdicionaTarefa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tarefa tarefa = new Tarefa();
		tarefa.setDescricao("Estudar	tudo 	");
		tarefa.setFinalizado(true);
		tarefa.setDataFinalizacao(Calendar.getInstance());
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(tarefa);
		manager.getTransaction().commit();
		System.out.println("ID	da	tarefa:	" + tarefa.getId());
		manager.close();

	}

}
