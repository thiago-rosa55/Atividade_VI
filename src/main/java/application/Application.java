package application;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Automovel;
import entities.Marca;
import entities.Modelo;


public class Application {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Marca m = new Marca();
		m.setNome("GM");
		Marca m2 = new Marca();
		m2.setNome("VOLKSWAGEN");
		
		Modelo mod = new Modelo();
		mod.setPotencia(3200);
		mod.setDescricao("Utilitário");
		mod.setMarca(m);
		Modelo mod2 = new Modelo();
		mod2.setDescricao("Sedan");
		mod2.setPotencia(1400);
		mod2.setMarca(m2);
		
		Automovel aut = new Automovel();
		aut.setAnoFabricacao(2019);
		aut.setAnoModelo(2019);
		aut.setObservacoes("Camionete S-10 Semi-Nova");
		aut.setPreco(95000);
		aut.setKilometragem(15000);
		aut.setModelo(mod);
		Automovel aut2 = new Automovel();
		aut2.setAnoFabricacao(2019);
		aut2.setAnoModelo(2020);
		aut2.setObservacoes("Sedan Jetta TSI Semi-Novo");
		aut2.setPreco(120000);
		aut2.setKilometragem(9000);
		aut2.setModelo(mod2);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("atividade6");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(m);
		em.persist(m2);
		em.persist(mod);
		em.persist(mod2);
		em.persist(aut);
		em.persist(aut2);
		
		em.getTransaction().commit();
		em.getTransaction().commit();
		em.getTransaction().commit();
		em.getTransaction().commit();
		em.getTransaction().commit();
		em.getTransaction().commit();
		
		Query query1 = em.createQuery("SELECT * FROM Automovel");
		List <Automovel> automoveis = query1.getResultList();
		for(Automovel a : automoveis){
			System.out.println("\n *** [" + a.getModelo() + " | "+ a.getObservacoes() + "] ***");
		}
		em.close();
		emf.close();
	}

}
