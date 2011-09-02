package annotation;

import org.springframework.stereotype.Component;

@Component("saluter")
public class EnterpriseSaluter implements Saluter {

	@Override
	public String getSalute() {
		// get salute from some fancy enterprise system
		throw new UnsupportedOperationException();
	}

}
