import java.io.Serializable;

public class Person implements Serializable{

	private String name;
	
	private String egn;
	
	public Person(String name, String egn) {
		this.setName(name);
		this.setEgn(egn);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEgn() {
		return egn;
	}

	public void setEgn(String egn) {
		this.egn = egn;
	}

	
}
