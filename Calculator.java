package Week1day1;

public class Calculator {

	public static void main(String[] args) {
		
						Calculator obj = new Calculator();
				
				obj.addnum();
				obj.subnum();
				obj.mulnum();
			    obj.divnum();
			    
			}

			public int addnum() {
				int num1 = 11;
				int num2 = 3;
				int addnum = num1 + num2;
			System.out.println("Sum of two numbers is " +addnum +" ,");
			return addnum;

		// TODO Auto-generated method stub
		
	}

			public int divnum() {
				int num1 = 8;
				int num2 = 4;
				int div;
				div = num1 / num2;
			System.out.println("Division of two numbers is "+ div +" .");
			return div;
				
			}

			public int mulnum() {
				int num1 = 10;
				int num2 = 4;
				int mul;
				mul = num1 * num2;
			System.out.println("Multiplication of two numbers is " + mul +" ,");
			return mul;
			
				
			}

			public int subnum() {
				int num1 = 10;
				int num2 = 4;
				int sub;
				sub = num1 - num2;
			System.out.println("Subtraction of two numbers is "+ sub +" ,");
			return sub;
			
				
			}

		// TODO Auto-generated method stub

	}


