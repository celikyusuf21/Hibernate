package com.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Northwind.class)
				.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {
			
	
			session.beginTransaction(); // Unit of Work
			
			
			// HQL -> Hibernate Query Language 
			// select *from northwind.customers ayni gorevi gorur.
			// "from Northwind c where c.company='Company A' OR c.company='Company B' OR c.company='Company OO' "
			// from Northwind c where c.company LIKE '%R%'
			// ASC -> Ascending -> Default olarak
			// DESC -> Descending
			// from Northwind c ORDER BY c.firstName DESC
			
			// Queries And Order-By
			/*
			 * List<Northwind> custmr = session.createQuery("select c.lastName from Northwind c GROUP BY c.lastName ").getResultList(); // C alias olarak kullandik 
			 * for(Northwind customers : custmr) { System.out.println(customers.getLastName()); }
			 */
			
			//Order-By
			/*
			 * List<String> lastNames = session.createQuery("select c.lastName from Northwind c GROUP BY c.lastName ").getResultList(); // C alias olarak kullandik 
			 * for(String lastName : lastNames) { System.out.println(customers.getLastName()); }
			 */
			
			
			// -- Insert --
			
//			Northwind customers = new Northwind();
//			customers.setLastName("Deli");
//			customers.setFirstName("Gönül");
//			customers.setCompany("Company BBBB");
//			session.save(customers);
			
			// UPDATE
			
//			Northwind customers = session.get(Northwind.class,21);
//			customers.setFirstName("Hamo");
//			session.save(customers);			
//			
//			CRUD -> Create Read Update Delete
			
			// DELETE 
			
			Northwind customers = session.get(Northwind.class,21);
			session.delete(customers);
			
			session.getTransaction().commit();
			System.out.println("Kisi Silindi");
			
		}
		finally {
			
			factory.close();
		}
		

	}

}
