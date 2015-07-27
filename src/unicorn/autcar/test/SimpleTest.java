package unicorn.autcar.test;

//import static org.junit.Assert.*;
import unicorn.autcar.Pobocka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import org.junit.Test;

public class SimpleTest {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Pobocka p = new Pobocka();
		s.persist(p);
		
		t.commit();
		s.close();
	}
		
	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/

}
