

public class Son extends Parent{
	public static void main(String[] args) {
		GrandParent person = new Son();
		person.say();
		
		
		GrandParent person2 = new Parent();
		person2.say();
	}
//	@Override
//	public void say() {
//		// TODO Auto-generated method stub
//		System.out.println("son say");
//	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("son run");
	}
	public void skip() {
		
	}
}
