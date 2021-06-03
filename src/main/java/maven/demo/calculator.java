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
	    }  
}
