
public class Parent extends GrandParent{
	public void say() {
		System.out.println(" parent say hello");
		System.out.println(this);
		run();
		
	}
	public void run() {
		System.out.println("parent run bu");
		
	}
}
