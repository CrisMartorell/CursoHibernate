package com.openwebinars.hibernate.primerproyectohbn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
    	
    	SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
    	
    	
    	//Código legacy
    	//SessionFactory sf = new Configuration().configure().buildSessionFactory();
    	
    	//Apertura de la sesión
    	Session session = sf.openSession();
    	
    	User user = new User();
    	user.setId(1);
    	user.setUserName("Pepe");
    	user.setUserMessage("Hello world from Pepe");
    	
    	
    	
    	
    	
    	session.close();
    	sf.close();
    
    	
    	
    }
}
