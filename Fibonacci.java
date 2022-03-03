package Week1day1;

public class Fibonacci {

	public static void main(String[] args) {
		int range=9;
		int firstNum=1;
		int secNum=2;
		int sum;
		System.out.println(firstNum);

		System.out.println(secNum);
		for(int i=1;i<range;i++)
		{
			
		sum=firstNum+secNum;	

			firstNum=secNum; 
			secNum=sum;
			System.out.println(sum);
		}

			}




}
