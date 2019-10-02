import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import financao.jpa.modelos.Conta;
import financao.jpa.modelos.Movimentacao;

public class Principal {
	
	
	public static void main(String[] args) {
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aluraJPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Conta conta = em.find(Conta.class,1);
		
		Movimentacao movimentacao = em.find(Movimentacao.class,1);
		em.getTransaction().commit();
		
		em.close();
		emf.close();		
		System.out.println(movimentacao);
	}

}
