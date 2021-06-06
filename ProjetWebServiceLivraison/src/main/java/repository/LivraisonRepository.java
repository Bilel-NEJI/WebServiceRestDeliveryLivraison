package repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Livraison;

public class LivraisonRepository {

	private EntityManager entityManager; 
	
	public EntityManager getEntityManager() {
		if (entityManager == null)
			{EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ProjetWebServiceLivraison");
			entityManager = entityManagerFactory.createEntityManager();	}
		return entityManager;	}
	
	
	
	public List <Livraison> selectAll () {
		Query q = getEntityManager().createNamedQuery("Livraison.findAll");
		return q.getResultList();	}

	
	public void insertLivraison(Livraison livraison) {
		getEntityManager().getTransaction().begin();
		getEntityManager().persist(livraison);
		getEntityManager().getTransaction().commit();
	}
	
	
	public Livraison updateLivraison(Livraison livraison) {
		getEntityManager().getTransaction().begin();
		getEntityManager().merge(livraison);
		getEntityManager().getTransaction().commit();
		Livraison l = getEntityManager().find(Livraison.class, livraison.getCode());
		return l;
	}
	
	
	
	public Livraison find(int code) {
		return getEntityManager().find(Livraison.class, code);
	}
	
	
	public void delete(int code) {
		getEntityManager().getTransaction().begin();
		Livraison e = find(code);
		getEntityManager().remove(e);
		getEntityManager().getTransaction().commit();
		
	}
	
	
	

	
	
}
