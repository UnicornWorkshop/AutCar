package unicorn.autcar;

public class Auto {
	private Integer id;
	private String znacka;
	private Integer vykonnost;
	private Integer velikost;
	private Integer kapacita;
	
	public Auto(Integer id, String znacka, Integer vykonnost, Integer velikost, Integer kapacita) {
		super();
		this.id = id;
		this.znacka = znacka;
		this.vykonnost = vykonnost;
		this.velikost = velikost;
		this.kapacita = kapacita;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getZnacka() {
		return znacka;
	}

	public void setZnacka(String znacka) {
		this.znacka = znacka;
	}

	public Integer getVykonnost() {
		return vykonnost;
	}

	public void setVykonnost(Integer vykonnost) {
		this.vykonnost = vykonnost;
	}

	public Integer getVelikost() {
		return velikost;
	}

	public void setVelikost(Integer velikost) {
		this.velikost = velikost;
	}

	public Integer getKapacita() {
		return kapacita;
	}

	public void setKapacita(Integer kapacita) {
		this.kapacita = kapacita;
	}
	
	
}