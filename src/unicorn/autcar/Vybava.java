package unicorn.autcar;

import java.util.Set;
/*import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.Id;  
import javax.persistence.ManyToMany;*/

//@Entity
public class Vybava {
	//@Id  
    //@GeneratedValue
	private Integer id;
	private String nazev;
	//@ManyToMany
	private Set<Auto> auto;
		
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
