package unicorn.autcar;

//import javax.persistence.Entity;

public class Pobocka {
	private Integer id;
	private String mesto;
	
	//@Id  
    //@GeneratedValue
	public Integer getId() {
		return id;
	}
	public String getMesto() {
		return mesto;
	}
	public void setMesto(String mesto) {
		this.mesto = mesto;
	}
}
