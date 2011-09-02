package xml;

public class DummyGreeter {

	public String greet(String name) {
		// new InitialContext(env).lookup("EnterpriseSaluter")
		Saluter saluter = new EnterpriseSaluter();
		return saluter.getSalute() + " " + name;
	}

}
