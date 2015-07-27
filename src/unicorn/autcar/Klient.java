package unicorn.autcar;

public class Klient {
	private Integer id;
	private String jmeno;
	public Klient(Integer id, String jmeno) {
		super();
		this.id = id;
		this.jmeno = jmeno;
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
}
