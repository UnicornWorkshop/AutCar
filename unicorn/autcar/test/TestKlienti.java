package unicorn.autcar.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.sun.corba.se.pept.transport.ContactInfo;

import unicorn.autcar.Auto;
import unicorn.autcar.Klient;
import unicorn.autcar.Kontakt;
import unicorn.autcar.TypyKontaktu;

//import org.junit.Test;

public class TestKlienti {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Auto a1 = new Auto("Ford", 1, 2, 3);
		Auto a2 = new Auto("Audi", 5, 6, 7);
		Auto a3 = new Auto("Nissan", 10, 20, 30);
		
		Klient k1 = new Klient("Pepa");
		Kontakt kon11 = new Kontakt(k1, TypyKontaktu.EMAIL, "pepa@seznam.cz");
		Kontakt kon12 = new Kontakt(k1, TypyKontaktu.MOB_TEL, "+420702802757");
		
		Klient k2 = new Klient("Ivan");
		Kontakt kon21 = new Kontakt(k2, TypyKontaktu.SKYPE, "ivan111");
		Kontakt kon22 = new Kontakt(k2, TypyKontaktu.EMAIL, "vanya@ya.ru");
		

		s.persist(a1);
		s.persist(a2);
		s.persist(a3);
		s.persist(k1);
		s.persist(k2);
		s.persist(kon11);
		s.persist(kon12);
		s.persist(kon21);
		s.persist(kon22);
		
		Query q = s.createQuery("SELECT auto FROM Auto as auto WHERE auto.id=:id");
		q.setParameter("id", 1);
		List<Auto> a = q.list();
		for (Auto auto : a) {
			System.out.println(auto.getZnacka().toString());
		}
		
		Criteria c = s.createCriteria(Auto.class).add(Restrictions.between("id", 1, 2));
		List<Auto> list = c.list();
		Iterator<Auto> it = list.iterator();
		System.out.println(it.next().getZnacka());
		
		t.commit();
		s.close();
	}
		
	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/

}
