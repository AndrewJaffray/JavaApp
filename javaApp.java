package JavaScanner;

import java.util.Scanner;



public class javaApp {

public static void main(String [] args) {
	
int firstNumber;
int secondNumber;


Scanner sc = new Scanner(System.in);	
System.out.print("Would you like to add or multiply?: ");	
String operation = sc.next();
	

System.out.print("Enter the first number: ");	
 firstNumber = sc.nextInt();
System.out.print("Enter the second number: ");
 secondNumber = sc.nextInt();
	
 int result = 0;
 
 
if (operation.equals("add")) { 
	result = firstNumber + secondNumber;
}else if (operation.equals("multiply")) {
	result = firstNumber * secondNumber;
}else if (operation.equals("exit"))	{
	System.exit(1);
} else {
	System.out.println("Invalid operation.");
	System.exit(1);
}
	System.out.println("The result is: " + result);	
	
	
	
	
}
}
