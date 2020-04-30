package com.example.sayon.updatedeletehibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
    	
    	Session session=sf.openSession();
    	
    	Transaction tx=session.beginTransaction();
    	
    	   for(int i=0;i<10;i++) {
        	   Usersdetails user=new Usersdetails();
        	
        	   user.setUname("user "+i);
      
    	       session.save(user);
    	      }
    	
    	 tx.commit();
    	 session.close();
    	 
    	 /*--------------FETECHING  DATA  FROM DATABASE-----------*/
    	 
    	 Usersdetails user=new Usersdetails();
    	 
    	 session=sf.openSession();
     	
     	 session.beginTransaction();
     	
     	 /* get method contains the classname whose obj is asked to save in db and primary key as parameter*/
     	 
     	 user=(Usersdetails)session.get(Usersdetails.class, 5);//typecasting is needed as get() returns object
     	 
     	 System.out.println("Username is pulled out:"+user.getUname());
     	 session.getTransaction().commit();
    	 session.close();
    	 
    	 
    /*--------------DELETEING  DATA  FROM DATABASE-----------*/
    	 
    	 Usersdetails user2=new Usersdetails();
    	 
    	 session=sf.openSession();
     	
     	 session.beginTransaction();
     	
     	 user2=(Usersdetails)session.get(Usersdetails.class, 5);//typecasting is needed as get() returns object
     	 session.delete(user2);
     	 
   
     	 session.getTransaction().commit();
    	 session.close();
    	 
    	
     	 
    	    /*--------------UPDATEING  DATA  IN   DATABASE-----------*/
    	    	 
    	    	 Usersdetails user3=new Usersdetails();
    	    	 
    	    	 session=sf.openSession();
    	     	
    	     	 session.beginTransaction();
    	     	
    	     	 user3=(Usersdetails)session.get(Usersdetails.class, 6);//typecasting is needed as get() returns object
    	     	 user3.setUname("Updated User");
    	     	 session.update(user3);
    	   
    	     	 session.getTransaction().commit();
    	    	 session.close();
    	    	 
    	    	 
    		
		    }
}
