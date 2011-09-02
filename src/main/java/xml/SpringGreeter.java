package xml;

public class SpringGreeter {
	
	private Saluter saluter;
	
	// setter dependency injection
	public void setSaluter(Saluter saluter) {
		this.saluter = saluter;
	}

	public String greet(String name) {
		return saluter.getSalute() + " " + name;
	}

}
