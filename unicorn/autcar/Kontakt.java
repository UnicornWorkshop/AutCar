package unicorn.autcar;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Kontakt {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	private Klient klient;
	private String data;
	private String typ;
	
	public Kontakt(Klient klient, TypyKontaktu typ, String data) {
		super();
		this.klient = klient;
		this.typ = typ.toString();
		this.data = data;
	}
	
	public Kontakt() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Klient getKlient() {
		return klient;
	}

	public void setKlient(Klient klient) {
		this.klient = klient;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(TypyKontaktu typ) {
		this.typ = typ.toString();
	}

}


/*package unicorn.autcar;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Kontakt {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	private Klient klient;
	private String data;
	private String typ;
	
	public Kontakt(Klient klient, String data, String typ) {
		super();
		this.klient = klient;
		this.data = data;
		this.typ = typ;
	}
	
	public Kontakt() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public Klient getKlient() {
		return klient;
	}

	public void setKlient(Klient klient) {
		this.klient = klient;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

}*/
