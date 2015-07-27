package unicorn.autcar;

public class Kontakt {
	private Integer id;
	private Integer id_klienta;
	private String data;
	private String typ;
	
	public Kontakt(Integer id, Integer id_klienta, String data, String typ) {
		super();
		this.id = id;
		this.id_klienta = id_klienta;
		this.data = data;
		this.typ = typ;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_klienta() {
		return id_klienta;
	}

	public void setId_klienta(Integer id_klienta) {
		this.id_klienta = id_klienta;
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

}
