package xml;

import xml.Saluter;

public class TestSaluter implements Saluter {

	private String salutation;
	
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	@Override
	public String getSalute() {
		return salutation;
	}

}
