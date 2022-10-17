package Practise;

public class StudentConstructorDemo {
	
	String name;
	int rollNo;
	
		
		public StudentConstructorDemo(String name, int rollNo) {
			super();
			this.name = name;
			this.rollNo = rollNo;
			
		}
		
		public static void main(String[] args) {
			StudentConstructorDemo s1 = new StudentConstructorDemo("Aniket",11);
			StudentConstructorDemo s2 = new StudentConstructorDemo("Amar",12);
			
			System.out.println(s1.name+"===="+s1.rollNo);
			System.out.println(s2.name+"===="+s2.rollNo);

		}
	}


