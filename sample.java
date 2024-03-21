import java.util.Scanner;

public class Sample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		//PrimeDemo obj=new PrimeDemo();
		boolean bool=Sample.isPrime(num);
		System.out.println(bool);
	}
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			System.out.println(n+" is a prime number");
			return false;
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is a prime number");
				return false;
			}
			
		}
		System.out.println(n+" is a prime number");
		return true;
	}    
	

}
