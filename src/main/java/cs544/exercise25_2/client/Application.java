package cs544.exercise25_2.client;

import cs544.exercise25_2.service.ICalculator;
import cs544.exercise25_2.service.IGreeting;
import cs544.exercise25_2.service.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		ICalculator remoteService = context.getBean("calculatorHttpInvokerProxy", ICalculator.class);


		int result = remoteService.calc('+',1);
		System.out.println("Receiving result: " + result);

	}
}
