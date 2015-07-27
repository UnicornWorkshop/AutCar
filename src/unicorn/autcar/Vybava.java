package unicorn.autcar;

import java.util.Set;

public class Vybava {
	private Integer id;
	private String nazev;
	//@ManyToMany
	private Set<Auto> auto;
	
	//@Id  
    //@GeneratedValue
	public Integer getId() {
		return id;
	}	
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
}
