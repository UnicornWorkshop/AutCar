package unicorn.autcar;

/*import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.Id;  
import javax.persistence.ManyToOne;*/


public class Rezervace {
	private Integer id;
	private Klient klient;
	private Auto auto;
	private Pobocka pobocka_z;
	private Pobocka pobocka_do;
	
	//@Id  
    //@GeneratedValue
	public Integer getId() {
		return id;
	}
	
	//@ManyToOne
	public Klient getKlient() {
		return klient;
	}
	public void setKlient(Klient klient) {
		this.klient = klient;
	}
	//@ManyToOne
	public Auto getAuto() {
		return auto;
	}
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	//@ManyToOne
	public Pobocka getPobocka_z() {
		return pobocka_z;
	}
	public void setPobocka_z(Pobocka pobocka_z) {
		this.pobocka_z = pobocka_z;
	}
	//@ManyToOne
	public Pobocka getPobocka_do() {
		return pobocka_do;
	}
	public void setPobocka_do(Pobocka pobocka_do) {
		this.pobocka_do = pobocka_do;
	}
}
