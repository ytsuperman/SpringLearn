import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Person  {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void testInit() {
		System.out.println("ceshi init");
		boolean instance = Person.class.isInstance(BeanFactory.class);
		System.out.println(instance);
		if (Person.class.isInstance(BeanFactory.class)) {
			System.out.println("是的");
		}
	}
	
}
