package myFirstProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class myFirstProgram {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("Students.txt"));
		
		List<String> Students = new ArrayList<String>();
		
		while(in.hasNextLine()) {
			Students.add(in.nextLine());
		}
		
		for(int i = 0; i < Students.size(); i++) {
			System.out.println("Name:" + Students.get(i));
		}
		
		in.close();
	}

}

