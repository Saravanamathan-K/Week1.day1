package Week1day1;

public class PrimeNumber {

	public static void main(String[] args) {
			


				int number=13;


						boolean flag=false;

						for(int i=2;i<number/2;i++) {
							
							if(number%i==0) {
								flag=true;
							}
								
						}
							
						if(!flag) {
							

						
							System.out.println("Prime");
							
						}

						
						else {
							System.out.println("Not a Prime");
						}
							

						

			}

		

		// TODO Auto-generated method stub

	}


