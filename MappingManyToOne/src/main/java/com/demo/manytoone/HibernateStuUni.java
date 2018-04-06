package com.demo.manytoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateStuUni {

	public static void main(String[] args) 
	{
		SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
		 Session session=sf.openSession();
		
		 StudentDemo st1=new StudentDemo("rohit","java");
		 StudentDemo st2=new StudentDemo("suhas","dot.net");
		 StudentDemo st3=new StudentDemo("sachin","Mysql");
		
		 University un=new University("pune", "india");
		 
		Transaction tx=session.beginTransaction();
		
		
		List<StudentDemo> lst=new ArrayList<StudentDemo>();
		
		st1.setUniversity(un);
		st2.setUniversity(un);
		st3.setUniversity(un);
		
		lst.add(st1);
		lst.add(st2);
		lst.add(st3);
		
	//	un.setStudent(lst);//bidriectional
	
		
		session.persist(un);
		session.persist(st1);
		session.persist(st2);
		session.persist(st3);
		
		tx.commit();
		session.close();
		
		

	}

}
