package Practise;

public class ConstructorDemo {
	
	public ConstructorDemo() {
		System.out.println("I am constructor1");
	}
	
	public ConstructorDemo(int a) {
		System.out.println("I am constructor2");
	}

	public static void main(String[] args) {
		ConstructorDemo a1	= new ConstructorDemo();
		ConstructorDemo a2	 = new ConstructorDemo(3);
		
	}
}
