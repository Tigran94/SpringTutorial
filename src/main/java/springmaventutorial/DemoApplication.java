package springmaventutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Object obj = context.getBean("t1000Empty");
		if(obj instanceof ModelT1000){
			ModelT1000 t1000 = (ModelT1000) obj;
			t1000.action();



		}

	}
}
