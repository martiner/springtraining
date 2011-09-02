package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("greeter")
public class SpringGreeter {
	
	@Autowired
	private Saluter saluter;

	public String greet(String name) {
		return saluter.getSalute() + " " + name;
	}

}
