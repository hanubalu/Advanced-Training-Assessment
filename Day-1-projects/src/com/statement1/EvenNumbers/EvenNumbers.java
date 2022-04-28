package com.statement1.EvenNumbers;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter the n value : ");
		  
		  int n = scan.nextInt();

		  for (int i = 1; i <= n; i++) {

		   if (i % 2 == 0) {

		  System.out.print(i + " ");

		   }

		   }
	}

}
