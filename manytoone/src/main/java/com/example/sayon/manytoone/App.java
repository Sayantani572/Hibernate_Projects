package com.example.sayon.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.setVehicleName("jeep");

		Vehicle v1 = new Vehicle();
		v1.setVehicleName("BMW");

		Usersdetails user = new Usersdetails();
		user.setId(109);
		user.setUname("Arati");

		
		/*
		 * multiple users mapping
		 */  v.setUser(user);
		     v1.setUser(user);
		    
		 
		/* Associating the list of vechicle obj into user obj */
		user.getListofvehicle().add(v);
		user.getListofvehicle().add(v1);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		session.beginTransaction();
		/* Saving the objects to the database */
		session.save(user);
		session.save(v);
		session.save(v1);
	
		session.getTransaction().commit();

		session.close();
	}
}
