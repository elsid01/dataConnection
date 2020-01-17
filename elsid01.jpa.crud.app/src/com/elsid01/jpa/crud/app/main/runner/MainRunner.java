package com.elsid01.jpa.crud.app.main.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import elsid01.jpa.crud.app.entity.relationship.Certificate;
import elsid01.jpa.crud.app.entity.relationship.NonTeachingStaff;
import elsid01.jpa.crud.app.entity.relationship.TeachingStaff;

public class MainRunner {

	public static void main(String[] args) {
		
		
		//testjpaQuery();
		//testJpaPersist(1000);
		//TestjpaPersist();
		//testJpaPersistCertificate();
		testCertificateList();
		

		


	}

	private static void testCertificateList() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("elsid01.jpa.crud.appFactory");

		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		ArrayList<Integer> phoneList= new ArrayList<>();
		phoneList.add(212);
		phoneList.add(347);
		phoneList.add(646);
        Certificate cOb = new Certificate();
        cOb.setCid(100);
        cOb.setCertName("JAVA");
        cOb.setDate("2005");
        List<Certificate> certObList = new ArrayList<>();
        certObList.add(new Certificate(2001,"java","2005"));
        certObList.add(new Certificate(2003,"Sql","2006"));
        certObList.add(new Certificate(2004,"JUnit","2007"));
        certObList.add(new Certificate(2005,"Scrum","2008"));
        certObList.add(new Certificate(2006,"Oracle","2009"));
        
		TeachingStaff ts = new TeachingStaff( 6, "Mike", "Something", "Computers",phoneList, certObList);
		
		manager.persist(ts);

		manager.getTransaction().commit();

		manager.close();

		factory.close();
		
		
	}

	private static void testJpaPersistCertificate() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("elsid01.jpa.crud.appFactory");

		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		ArrayList<Integer> phoneList= new ArrayList<>();
		phoneList.add(212);
		phoneList.add(347);
		phoneList.add(646);
        Certificate cOb = new Certificate();
        cOb.setCid(100);
        cOb.setCertName("JAVA");
        cOb.setDate("2005");
		TeachingStaff ts = new TeachingStaff( 6, "Mike", "Something", "Computers",phoneList,cOb);
		
		manager.persist(ts);

		manager.getTransaction().commit();

		manager.close();

		factory.close();
		
		
	}

	private static void testJpaPersist(int i) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("elsid01.jpa.crud.appFactory");

		EntityManager manager = factory.createEntityManager();
		ArrayList<Integer> phoneList= new ArrayList<>();
		phoneList.add(212);
		phoneList.add(347);
		phoneList.add(646);
		
		TeachingStaff ts;
		Certificate certOb;
		for(int j=1; j<=i;j++) {
			certOb= new Certificate(100,"associate","2005");
			manager.getTransaction().begin();
		    ts = new TeachingStaff( j, "Mike", "Something", "Computers", phoneList, certOb);
			ts.setSid(j);
			manager.persist(ts);
			
			manager.getTransaction().commit();
			
		}

		//manager.persist(ts);

		//manager.persist(ns);

		manager.close();

		factory.close();
	}

	private static void testjpaQuery() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("elsid01.jpa.crud.appFactory");

		EntityManager manager = factory.createEntityManager();
		//transaction
		String teachingStaffQuery = "SELECT t FROM TeachingStaff t ";
		Query query =manager.createQuery(teachingStaffQuery);
		List<TeachingStaff> tsList=query.getResultList();
		for(TeachingStaff ts: tsList) {
			System.out.println(ts.getPhone());
		}
		
       //close
		manager.close();

		factory.close();
		
	}

	private static void TestjpaPersist() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("elsid01.jpa.crud.appFactory");

		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		ArrayList<Integer> phoneList= new ArrayList<>();
		phoneList.add(212);
		phoneList.add(347);
		phoneList.add(646);
        Certificate cOb = new Certificate(100,"associate","2005");
		TeachingStaff ts = new TeachingStaff( 6, "Mike", "Something", "Computers",phoneList,cOb);
		NonTeachingStaff ns = new NonTeachingStaff(127, "Zamira", "Finding people jobs",phoneList);

		
		

		manager.persist(ts);

		manager.persist(ns);
		

		manager.getTransaction().commit();

		manager.close();

		factory.close();
		
	}

}
