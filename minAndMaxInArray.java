package javaTutMod;

import java.util.Scanner;

public class minAndMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double[] myList = new double[5];
		double totalValue = 0;
				
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter number " + (i+1) + " :");
			myList[i] = input.nextDouble();
		}
		
		System.out.print("The array is [ ");
		
		double minValue = myList[0]; // Setting minValue to the starting index
		double maxValue = myList[0]; // Setting minValue to the starting index

		for (int i = 0; i < 5; i++) {
			System.out.print(myList[i] + " ");
			totalValue = totalValue + myList[i];
			
			// Finding the minimum value ...
			if (myList[i] < minValue) {
				minValue = myList[i];
			}
			
			// Finding the maximum value ...
			if (myList[i] > maxValue) {
				maxValue = myList[i];
			}
		}
		
		System.out.println("]");
		
		System.out.println("Total: " + totalValue);
		System.out.println("Minimum: " + minValue);
		System.out.println("Maximum: " + maxValue);
		
		input.close();
	}
}
