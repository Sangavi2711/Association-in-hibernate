package com.model;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tr = null;
		try(Session ses=hibernateUtil.getSesFactory().openSession()){
			tr =ses.beginTransaction();
			Employee e=new Employee();
			e.setName("Sangavi");
			e.setEmail("sangavi@gmail.com");
			Address a=new Address("VSB clg","Covai road","Karur","TN",639111);
			e.setAddress(a);
			ses.persist(e);
			a.setEmp(e);
			tr.commit();
			ses.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}