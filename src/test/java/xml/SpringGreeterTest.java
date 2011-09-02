package xml;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import xml.SpringGreeter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/helloworld.xml", "classpath:/helloworld-test.xml"})
public class SpringGreeterTest {
	
	// dependency injection by type
	@Autowired
	private SpringGreeter greeter;
	
	@Test
	public void greet() {
		String greet = greeter.greet("World");
		Assert.assertEquals("Hello World", greet);
	}

}
