package co.grandcircus.coffeeShop;


	import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
	
	@Repository
	@Transactional	
	public class ItemDao {
		
		@PersistenceContext
		private EntityManager em;

		public List<Items> findAll() {
			return em.createQuery("FROM Items", Items.class).getResultList();
		}
		
		public Items findById(Long id) {
			return em.find(Items.class, id);

		}
		
		
		public void update(Items items) {
			em.merge(items);
		}
		
		public void create(Items items) {
			em.persist(items);
		}
		
		public void delete(Long id) {
			Items items = em.getReference(Items.class, id);
			em.remove(items);
		}
	}


