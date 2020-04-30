package com.example.sayon.InheritanceHibernate;

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
         
    	TwowheelerVehicle bike=new TwowheelerVehicle();
    	bike.setVehicleName("BIKE");
    	bike.setSteeringHandle("Bike Steering handle");
         
         
    	FourwheelerVehicle car=new FourwheelerVehicle();
    	car.setVehicleName("CAR");
    	car.setSteeringwheel("car steering wheel");
    	
    	
         SessionFactory sf=new Configuration().configure().buildSessionFactory();
         Session session=sf.openSession();
         
         session.beginTransaction();
         
         
        /*  Saving the objects to the database */
        
         session.save(v);
         session.save(bike);
         session.save(car);
         
         
         session.getTransaction().commit();
         
         session.close();
    }
}
