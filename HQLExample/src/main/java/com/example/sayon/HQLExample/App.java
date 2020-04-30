package com.example.sayon.HQLExample;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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
    	
    	session.beginTransaction();

		  Query query=session.createQuery("from Usersdetails");/*here usersdetails is
		 the entity class*/
		  
		  List lists = query.list();/*list() will return list of all the records of the
		  table that is mapped wth the usersdetails class*/
		
		 Query query1=session.createQuery("from Usersdetails where id>14");/*here id
		  is the field name of userdetails class*/
		 
		  List lists1 = query1.list();/*list() will return list of all the records of
		 the table that is mapped wth the usersdetails class*/
		 
        Query query2=session.createQuery(" select uname from Usersdetails ");/*here uname is the member vari name of Usersdetails class*/
        
     
        /*----Page Initiation-----*/
        query2.setFirstResult(2);//startingpoint from where it will fetch the data among the whole table
        
        query2.setMaxResults(5); /*it tells the hibernate wht is the max no of records we want to pulled up
			
			what happens in setMaxresult(),it will fetech the records when it reaches 1 it will stop even if table has 
			 
			 more records available*/
        
        
        List lists2 = query2.list();
        
        for(Object u:lists2)
        {
        	System.out.println(u);
        }
        
        /*--------PARAMETER SUBSTITUTION INSTEAD OF SQL INJECTION  EXAMPLE-------------
        String usersId="13";
        String usersname="user 2";
        
        Query query3=session.createQuery("from Usersdetails where id>? and uname=? ");
        query3.setInteger(0,Integer.parseInt(usersId));
        query3.setString(1, usersname);
        
        
        List lists3=query3.list();
        */
       
        
        String usersId="2";
        String usersname="user 2";
        
        Query query3=session.createQuery("from Usersdetails where id> :usersId and uname= :usersname");
        query3.setInteger("usersId", Integer.parseInt(usersId));
        query3.setString("usersname", usersname);
        
        
        List lists3=query3.list();
        
        
        
        
        session.getTransaction().commit();
        session.close();
		 System.out.println("Size of list result:"+lists.size());
		 
		 System.out.println("objects of list result:"+lists);
		 
        System.out.println("objects of list result2:"+lists1);
        
        System.out.println("objects of list result3:"+lists2);
        
        System.out.println("objects of list result4:"+lists3);
   
    }
}
