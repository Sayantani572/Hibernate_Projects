package com.example.sayon.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	
    	 Vehicle v=new Vehicle();
         v.setVehicleName("Cycle");
         
        userdetails user =new userdetails();
        user.setId(3);
        user.setUname("Sayanti Das");
        user.setVehicle(v);
       
        /* associate the value of vahicle object into the user object*/
        
        
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        
        session.beginTransaction();
       /*  Saving the objects to the database */
        session.save(user);
        session.save(v);
        
        session.getTransaction().commit();
        
        session.close();
    }
}
