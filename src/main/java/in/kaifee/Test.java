package in.kaifee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=
			new ClassPathXmlApplicationContext("Beans.xml");
	Car c=ac.getBean(Car.class);
	c.drive();
	
}
}
