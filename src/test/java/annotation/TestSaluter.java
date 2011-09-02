package annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @Primary
public class TestSaluter implements Saluter {

	@Override
	public String getSalute() {
		return "Hello";
	}

}
