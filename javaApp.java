package JavaScanner;

import java.util.Scanner;



public class javaApp {

public static void main(String [] args) {
	
int firstNumber;
int secondNumber;


Scanner sc = new Scanner(System.in);	
System.out.print("Would you like to add or multiply?: ");	
String operation = sc.next();

if operation = "add" 
	(firstNumber + secondNumber);



if String operation = "multiply"
	(firstNumber * secondNumber);
	
System.out.print("Enter the first number: ");	
 firstNumber = sc.nextInt();
System.out.print("Enter the second number: ");
 secondNumber = sc.nextInt();
	
int result = performOperation( firstNumber,  secondNumber, operation);
	System.out.println("The result is: " + result);	
	
	
	
	
}
}
