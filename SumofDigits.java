package Week1day1;

public class SumofDigits {

	public static void main(String[] args) {
		
				
				int number = 124;

						int sum=0;

						while(number>0) {
							

							int remainder = number%10;

							System.out.println(remainder);
						
							sum +=remainder;
						
							System.out.println(sum);
						
							number = number/10;
							
							System.out.println(number);
							
						}

						
						System.out.println("Sum of the digits "+ sum);
			}

	
		
}	


