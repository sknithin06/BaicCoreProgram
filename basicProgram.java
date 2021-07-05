package Java;

import java.util.Random;
import java.util.Scanner;

public class basicProgram {
	public static final Scanner sc= new Scanner(System.in);   
	public static void main(String[] args) {
		System.out.println("Welcome to BasicCoreProgram");
		  
		System.out.print("Enter a number times to flip a coin:"); 
		int n = sc.nextInt();
		int head = 0;
		int tail = 0;
		for (int i =0; i <n; i++) {
			Random random = new Random();
			double p = random.nextDouble();
			double  x =Math.round(p * 10) / 10.0;
			System.out.println("Rolling the dice we get:"+x);
			if (x < 0.5) {
				System.out.println("head is the winner");
				head = head + 1;
			}
			else {
				System.out.println("tail is the winner");
				tail = tail + 1;
			}
		}
		System.out.println("Number of times the Head wins is:"+head);
		System.out.println("Number of times the tail wins is:"+tail);
		double a = (double) head / n * 100;	
		double b = (double) tail / n * 100;
		System.out.println("Winning Percentage Heads is:"+a);
		System.out.println("Winning Percentage Tails is:"+b);
		
		System.out.print("Enter a Year:");  
		int year=sc.nextInt(); 
		
		int x = year % 4;
		int y = year % 100;
		int z= year % 400;
		if (x == 0 && y != 0 || z == 0) {
			System.out.println("Given year is Leap Year:"+year);
		
		}
		else {
			System.out.println("Given year is not a Leap Year:"+year);
		}
		
		System.out.print("Enter a value of a:"); 
		int num = sc.nextInt();
		double v = 0;
		for (int i = 0; i <= num; i++) {		
			v = Math.pow(2,i);
		}
		System.out.println("Power of the Given Number is:" +v);	
		
		System.out.print("Enter a number:");  
		int hpNum=sc.nextInt(); 
		double sum = 0.0;
		for (int i = 1; i <= hpNum; i++) {
			sum = sum + (double) 1 / i;
			System.out.println("Harmonic value of given number is:"+sum);
		}
		System.out.println("Harmonic value of given number is:"+sum);
		
		System.out.print("Enter a number:");  
		int primeNum = sc.nextInt();
		for (int i = 2; i < Math.sqrt(primeNum); i++) {
			while (primeNum % i == 0) {
				System.out .println("prime factor of the given number is:"+i);
				primeNum = primeNum / i;
			}
		}
		if ( primeNum > 2) {
			System.out .println("prime factor of the given number is:"+primeNum);
		}
		
		System.out.print("Enter a number:");  
		double num1 = sc.nextDouble();
		System.out.print("Enter a number:");  
		double num2 = sc.nextDouble();
		double c = num1 + num2;
		num1 = c - num1;
		num2 = c - num2;
		System.out.println("Swap Number of a is:"+num1);
		System.out.println("Swap Number of b is:"+num2);
		
		System.out.print("Enter a value of Divisor :");  
		int divisor = sc.nextInt();
		System.out.print("Enter a value of Dividend:"); 
		int dividend = sc.nextInt();
		int Quotient = dividend / divisor;
		int Remainder = dividend % divisor;
		System.out.println("Quotient is:"+Quotient);
		System.out.println("Remainder is:"+Remainder);
		
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter a Letter:");  
		char letter = sc.next().charAt(0);
		
		if ( letter == 'A'|| letter == 'a' || 
				letter == 'e' || letter == 'E' || 
				letter == 'i' || letter == 'I' || 
				letter == 'o' || letter == 'O' ||
				letter == 'u' || letter == 'U') {
			System.out.println("Given Alphabet is Vowel:"+letter);
		}
		else {
			System.out.println("Given Alphabet is Consonant:"+letter);
		}
		
		System.out.print("Enter a number:");  
		double value1=sc.nextDouble();  
		System.out.print("Enter a number:");  
		double value2=sc.nextDouble();  
		System.out.print("Enter a number:");  
		double value3= sc.nextDouble();  
		
		if( value1 > value2 && value1 > value3) {
			System.out.println("the largest value is:"+value1);
		}
		else if (value2 > value3 &&  value2 > value1) {
			System.out.println("the largest value is:"+value2);
		}
		else {
			System.out.println("the largest value is"+value3);
		}
	}
}
