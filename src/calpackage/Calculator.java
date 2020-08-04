package calpackage;
import java.util.Scanner;

public class Calculator {
	public static void main(String args[])
	{
		int num1,num2;
		int output;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1 : ");
		num1=sc.nextInt();
		System.out.println("Enter number2 : ");
		num2=sc.nextInt();
		System.out.println("Enter the operator + for adding and - for subtraction (*) for multiplication and '/' for divide : ");
		char op = sc.next().charAt(0);
		
		switch(op)
		{
		case '+' :
			output = num1+num2;
			break;
		case '-':
			output=num1-num2;
			break;
		case '*':
			output = num1*num2;
			break;
		case '/':
			output= num1/num2;
			break;
			
		default :
			System.out.println("Invalid operator");
			return;
		}
		System.out.println(num1 +" " +op +" " +num2+" :" +output);
		
		
		
		
	}

}
