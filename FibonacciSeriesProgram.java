package com.fibSeries;
import java.util.Scanner;

public class FibonacciSeriesProgram {

		public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of terms:");
		int nTerms = input.nextInt();
		int firstTerm = 0 ;
		int SecondTerm = 1 ;
	
		System.out.print("Fibonacci Series :");
		
		for(int i = 0; i <nTerms; i++){
			System.out.print(firstTerm + " ");
		
			int nextTerm = firstTerm + SecondTerm;
			firstTerm = SecondTerm;
			SecondTerm = nextTerm;
		}
		
		
	}
	

}
