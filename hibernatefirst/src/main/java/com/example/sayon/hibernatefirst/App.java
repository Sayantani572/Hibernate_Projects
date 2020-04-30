package com.example.sayon.hibernatefirst;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    
    	Address adr=new Address();
    	adr.setStreet("bandel");
    	adr.setCity("hoghly");
    	adr.setState("West bengal");
    	adr.setPincode("712208");
    	
    	Alien al=new Alien();
    	al.setId(106);
    	al.setName("Tuni");
    	al.getListofaddress().add(adr);
    	SessionFactory sf=new Configuration().configure().buildSessionFactory();
    	
    	Session session=sf.openSession();
    	
    	Transaction tx=session.beginTransaction();
    	
    	session.save(al);
    	tx.commit();
    	session.close();
		/*
		 * al=null;
		 * 
		 * session=sf.openSession();
		 * 
		 * session.beginTransaction();
		 * 
		 * al=(Alien)session.get(Alien.class,101);
		 * 
		 * System.out.println("Username is retrieved:"+al.getName());
		 */ 
    }
}
