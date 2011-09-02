package xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringGreeterRunner {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/helloworld.xml");
		SpringGreeter greeter = ctx.getBean("greeter", SpringGreeter.class);
		System.out.println(greeter.greet("World"));
	}

}
