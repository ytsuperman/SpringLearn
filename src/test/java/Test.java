import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;

public class Test extends AbstractApplicationContext{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String[] arr = new String[2];
		arr[0] = "spring.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(context);
		Object bean = context.getBean("person");
		System.out.println(bean);
		Class<? extends Student> class1 = new Student().getClass();
		if (Student.class == new Student().getClass()) {
			System.out.println("true");
		}
		Test abstractApplicationContext = new Test();
		abstractApplicationContext.refresh();
	}

	@Override
	protected void refreshBeanFactory() throws BeansException, IllegalStateException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void closeBeanFactory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ConfigurableListableBeanFactory getBeanFactory() throws IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	protected void onRefresh(){
		System.out.println("onrefresh");
	}

	@Override
	public <T> ObjectProvider<T> getBeanProvider(Class<T> requiredType, boolean allowEagerInit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> ObjectProvider<T> getBeanProvider(ResolvableType requiredType, boolean allowEagerInit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getBeanNamesForType(ResolvableType type, boolean includeNonSingletons, boolean allowEagerInit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> ObjectProvider<T> getBeanProvider(Class<T> requiredType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> ObjectProvider<T> getBeanProvider(ResolvableType requiredType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getType(String name, boolean allowFactoryBeanInit) throws NoSuchBeanDefinitionException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
