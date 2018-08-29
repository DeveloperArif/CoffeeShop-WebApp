package co.grandcircus.coffeeShop;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDao {
	
	

		// DAO stands for Data Access Object.
		// DAOs are used as a layer of code that is responsible for communicating
		// with the database. On the Java side, we use the Room POJO with properties.
		// On the SQL side, there are corresponding rows and columns.
		// The @Repository annotation tells Spring both that this is a component
		// (a.k.a Spring Bean) that can be autowired and that it should be treated like
		// a DAO (which mostly applies to error handling behind the scenes).
		
			
			
			@PersistenceContext
			private EntityManager em;

			
			
			public void create(User users) {
				em.persist(users);
			}
			
			public List<User>findAll() {
				return em.createQuery("FROM Task", User.class).getResultList();
			}
			
			public User findById(Long id) {
				return em.find(User.class, id);

			}
			
		
		}

	
