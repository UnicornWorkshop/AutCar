package unicorn.autcar.test;

import unicorn.autcar.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SimpleTest {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Pobocka p = new Pobocka("Brno");
		s.persist(p);
		
		Auto a = new Auto("Skoda", 200, 10000, 4);
		a.setPobocka(p);
		s.persist(a);
		
		Vybava v = new Vybava();
		
		t.commit();
		s.close();
	}
}
