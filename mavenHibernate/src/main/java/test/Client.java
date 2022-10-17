package test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {

	public static void main(String[] agrs) throws InterruptedException {
		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction(); // Transaction is required for insert and update, but not required for select operations
		
		
		Student student = new Student(102, "BobEvan's", "bobevans@foodie.com", "924");
		//int pk = (Integer) session.save(student); // return the primary key;
		//session.saveOrUpdate(student); // update if current pk existed, o.w. create a new entry.
		session.persist(student); // return void
		
		t.commit();
		//Hibernate is not auto commit.
		Thread.sleep(20000);
		session.close();
		sf.close();
		System.out.println("Data inserted Successfully");
		
	}
}
