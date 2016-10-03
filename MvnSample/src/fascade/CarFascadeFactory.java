package fascade;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarFascadeFactory {

	/**
	 * Get an object of carFascade
	 * 
	 * @return CarFascade Object
	 */

	public static CarFascade get() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanContext.xml");
		CarFascade carFascade = (CarFascade) context.getBean("carFascade");
		context.close();
		return carFascade;
	}
}
