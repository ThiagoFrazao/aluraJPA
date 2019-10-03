import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Principal {
	
	public static void main(String[] args) {
		
		
		
/*		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aluraJPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Conta conta = em.find(Conta.class,1);
		
		Movimentacao movimentacao = em.find(Movimentacao.class,1);
		em.getTransaction().commit();

		em.close();
		emf.close();		
		System.out.println(movimentacao);
		*/		
		
		List<String> lista = new ArrayList<>(Arrays.asList("batata","cenoura","batata doce","Batata","BATATA"));
		OptionalDouble media = lista.parallelStream().map(String::toLowerCase)
								 .sorted(Comparator.comparing(String::length))
								 .filter(i -> i.contains("batata"))								 
								 .mapToInt(String::length)
					             .average();
		 
		 System.out.println(media);
		
	}

}
