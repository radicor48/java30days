package myFirstProgram;

import java.util.Scanner;

public class myFirstProgram {

	public static void main(String[] args) {
		System.out.println("Enter Your Name");
		
		Scanner in = new Scanner(System.in);
//		String s = in.nextLine();
		
//		if(s.equals("Rads")) {
//			System.out.println("Hello Richard");
//		}else if (s.equals("Nicky")){
//			System.out.println("Hi Nicholas");
//		}else {
//			System.out.println("It is not equal");
//		}
		
		int i = 0;
		do {
			System.out.println("I is " + i);
			i++;
		
		}while(i < 10) ;
//		for(int x = 0; x <= 5; x++) {
//			System.out.println("x is " + x);
//		}
		
		in.close();
		
	}

}
