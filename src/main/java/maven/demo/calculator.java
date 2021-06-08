package maven.demo;

public class calculator {
	
	public static int add(int a, int b) {
		return a+b;
		
	}
	
	public static int sub(int a, int b) {
		return a-b;
		
	}
	public static int multi(int a, int b) {
		return a*b;
		
	}
	
	public static int divide(int a, int b) {
		return a/b;
		
	}
   
	public static void main(String args[]){  
	     int result1 = calculator.add(10,10);
	     int result2 = calculator.sub(20,10);
	     int result3 = calculator.multi(20,10);
	     int result4 = calculator.divide(20,10);
	     System.out.println(result1);
	     System.out.println(result2);
	     System.out.println(result3);
	     System.out.println(result4);
	     
	     encapsulationPractice obj1 = new encapsulationPractice();
	     obj1.setName("Dhruv");
	     obj1.setAccountNo(100734385);
	     obj1.setAmount(1000);
	     
	     
			//obj1.insert("Dhruv", 100734385, 1000 ); 
	     System.out.println("hello "+ obj1.getName() + " your account no is "+obj1.getAccountNo() + " your balance is $"+obj1.getAmount());
			
	    }  
}
