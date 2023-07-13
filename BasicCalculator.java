package com.programs;
import java.util.Scanner;

public class BasicCalculator {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		boolean exit = false ;
		
		while(!exit) {
		System.out.println("Enter the first number");
		int a = input.nextInt();
		
		System.out.println("Enter the Second number");
		int b = input.nextInt();
		
		System.out.println("Select the operator: +, -, *, / ");
		String operator = input.next();
		
		int result = 0;
		
		switch(operator) {
		
		case "+":
            result = a + b;
            break;
            
        case "-":
            result = a - b;
            break;
            
        case "*":
            result = a * b;
            break;
            
        case "/":
         result = a / b;
		}
		
		  System.out.println("Result" +" "+ result);
		  System.out.println("Do you want to perform another calculation? (yes/no)");
          String choice = input.next();
          if (!choice.equalsIgnoreCase("yes")) {
              exit = true;
          }
		
		
		}
		System.out.println("Calculator program has exited.");
		
	}

}
