package sampleproject.java;

import java.util.Scanner;

public class NumberNames {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers ");
        int number=sc.nextInt();

        if (number >= 0 && number <= 9) {
            printNumberNames(number);
        } 
        else {
            System.out.println("The number should be between 0 and 9");
        }
    }

    public static void printNumberNames(int number) {
        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        }
	}

}
