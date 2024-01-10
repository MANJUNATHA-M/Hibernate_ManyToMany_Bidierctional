package com.hibernate.manytoMANY.mapbiderectional.Many_To_Many_Bi;

import java.util.ArrayList;
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

		Employee e=new Employee();
		e.seteId(1);
		e.seteName("Rani");
		e.seteSal(50000000);
	
	
		Employee e1=new Employee();
		e1.seteId(2);
		e1.seteName("Hansa");
		e1.seteSal(59876543);
		
		Employee e2=new Employee();
		e2.seteId(3);
		e2.seteName("manju");
		e2.seteSal(998786543);
		
	
		Company c=new Company();
		c.setcId(101);
		c.setcName("IBM");
		
		Company c1=new Company();
		c1.setcId(102);
		c1.setcName("Capgemini");
		
		Company c2=new Company();
		c2.setcId(103);
		c2.setcName("Volvo");
		
		e.getClist().add(c);
		e1.getClist().add(c1);
		e1.getClist().add(c2);
		
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Company.class);
		SessionFactory	sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		
		
		List<Object> lists=new ArrayList<Object>();
		lists.add(e);
		lists.add(e1);
		lists.add(c);
		lists.add(c1);
		lists.add(e2);
		lists.add(c2);
		
		for(Object list:lists)
		{
			session.save(list);
			System.out.println(list);
		}
		
		trans.commit();
		session.close();


	}
}
