package com.cg.hibernatee.cache;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import org.hibernate.cfg.Configuration;



public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("cache data");
		try{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");  
	      
		  
		SessionFactory factory =cfg.buildSessionFactory(); 
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		          
		Shape shape=new Shape();
		shape=(Shape)session.get(Shape.class,7);
	System.out.println(shape);
		     
		
		    t.commit();  
		    session.close();
		    
		    System.out.println("successfully saved");    
		}catch(Exception e){
			System.out.println("problem in connection"+e.getMessage());
		
		   
	}


	}

}
