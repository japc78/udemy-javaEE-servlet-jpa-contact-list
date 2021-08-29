package beans;

public class Contact {
	private int id;
	private String name;
	private String email;
	private int numberPhone;
	
	
	public Contact() {
	}


	public Contact(int id, String name, String email, int numberPhone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.numberPhone = numberPhone;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getNumberPhone() {
		return numberPhone;
	}


	public void setNumberPhone(int numberPhone) {
		this.numberPhone = numberPhone;
	}	
}
