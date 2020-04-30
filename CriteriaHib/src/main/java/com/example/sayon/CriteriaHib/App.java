package com.example.sayon.CriteriaHib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	   SessionFactory sf=new Configuration().configure().buildSessionFactory();
       	
       	   Session session=sf.openSession();
       	
       	   Transaction tx=session.beginTransaction();
       	   
       	   
       	 		
			  Criteria criteria =session.createCriteria(Usersdetails.class);
			  criteria.add(Restrictions.eq("uname","user 6"));//eq here is equal restrictions
			  /* uname is field name of the entity class*/
			  
			  List list= criteria.list();
			  
			 session.getTransaction().commit();
       	    session.close();
       	 
       	     System.out.println("Name:"+list);
       	
    }
}
