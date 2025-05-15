package javaTutMod;

import java.util.Scanner;

public class whileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int num = 1;
		
		while(num != 0) {
			System.out.println("Hey there, Press 1 to continue and 0 to quit: ");
			num = input.nextInt();
		}
		
		input.close();
	}

}
