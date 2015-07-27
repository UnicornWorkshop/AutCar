package unicorn.autcar;

import java.util.Set;

public class Klient {
	//@Id @GeneratedValue
	private Integer id;
	private String jmeno;
	//@OneToMany(mappedBy="klient")
	private Set<Kontakt> kontakt;
	
	public Klient(String jmeno, Set<Kontakt> kontakt) {
		super();
		this.jmeno = jmeno;
		this.kontakt = kontakt;
	}
	
	public Klient() {
		super();
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getJmeno() {
		return jmeno;
	}
	
	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}
	
	public Set<Kontakt> getKontakt() {
		return kontakt;
	}
	
	public void setKontakt(Set<Kontakt> kontakt) {
		this.kontakt = kontakt;
	}
}
