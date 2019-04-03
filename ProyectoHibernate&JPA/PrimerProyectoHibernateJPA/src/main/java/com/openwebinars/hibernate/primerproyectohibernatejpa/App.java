package com.openwebinars.hibernate.primerproyectohibernatejpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PrimerProyectoHibernateJPA");
        EntityManager em = emf.createEntityManager();
        
        
        User user1 = new User();
		user1.setId(1);
		user1.setUserName("Pepe");
		user1.setUserMessage("Hello world from Pepe");

		User user2 = new User();
		user2.setId(2);
		user2.setUserName("Juan");
		user2.setUserMessage("Hello world from Juan");        
        
        em.getTransaction().begin();
        
        em.persist(user1);
        em.persist(user2);
        
        em.getTransaction().commit();
		
		
        em.close();
        emf.close();
    }
}
