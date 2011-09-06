package annotation;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/annotation.xml"})
public class SpringGreeterTest {
	
	// dependency injection by type
	@Autowired
	private SpringGreeter greeter;
	
	@Test
	public void greet() {
		String greet = greeter.greet("World");
		Assert.assertEquals("hola World", greet);
	}

}
