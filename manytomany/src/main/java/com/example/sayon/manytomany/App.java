package com.example.sayon.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   	 Vehicle v=new Vehicle();
     v.setVehicleName("Cycle");
     
     Vehicle v1=new Vehicle();
     v1.setVehicleName("motor cycle");
	
	
   Usersdetails user=new Usersdetails();
   user.setId(100);
   user.setUname("Sayani");
   
   /*mapping class initialization*/
   
   user.getListofvehicle().add(v);
   user.getListofvehicle().add(v);
   
   v.getListofusers().add(user);
   v.getListofusers().add(user);
   
   
   
   
   SessionFactory sf=new Configuration().configure().buildSessionFactory();
   Session session=sf.openSession();
   
   session.beginTransaction();
   
   
  /*  Saving the objects to the database */
   session.save(user);
   session.save(v);
   session.save(v1);
   
   
   session.getTransaction().commit();
   
   session.close();
       
    }
}
