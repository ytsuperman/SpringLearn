import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		System.out.println("初始化 before--实例化的bean对象:"+bean+"\t"+beanName);
		// 可以根据beanName不同执行不同的处理操作
		return bean;
	}

	/**
	 * 实例化、依赖注入、初始化完毕时执行 
	 * 注意：方法返回值不能为null
	 * 如果返回null那么在后续初始化方法将报空指针异常或者通过getBean()方法获取不到bena实例对象
	 * 因为后置处理器从Spring IoC容器中取出bean实例对象没有再次放回IoC容器中
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)  {
		System.out.println("初始化 after...实例化的bean对象:"+bean+"\t"+beanName);
		// 可以根据beanName不同执行不同的处理操作
		return bean;
	}

}
