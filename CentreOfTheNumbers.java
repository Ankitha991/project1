import java.util.Scanner;

public class CentreOfTheNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		//int num1=sc.nextInt();
		int[] arr=new int[5];
		//System.out.println("Enter the limit number");
		//int num2=sc.nextInt();
		for(int i=0;i<=arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<=arr.length;j++)
		{
			if(j%2==0)
			{
				System.out.println(j);
			}
		}
	}

}
