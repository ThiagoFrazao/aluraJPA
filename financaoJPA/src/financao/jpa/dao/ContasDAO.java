package financao.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import financao.jpa.modelos.Conta;

@Transactional
public class ContasDAO {
	
	@PersistenceContext
	private EntityManager contasManager;

	
	public void salvarConta(Conta conta){
		this.contasManager.persist(conta);
	}
	
	public Conta recuperarConta(int ID){
		return this.contasManager.find(Conta.class, ID);
	}
	
}
