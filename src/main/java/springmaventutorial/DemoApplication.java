package springmaventutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");
		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
        System.out.println(t1000.getHead());
//        t1000 = (ModelT1000) context.getBean("t1000");
//        System.out.println(t1000.getHead());
//        t1000 = (ModelT1000) context.getBean("t1000");
//        System.out.println(t1000.getHead());
	}
}
