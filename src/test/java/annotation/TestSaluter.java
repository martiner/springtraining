package annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component @Primary
public class TestSaluter implements Saluter {

	@Value("${salutation}")
	private String salutation;
	
	@Override
	public String getSalute() {
		return salutation;
	}

}
