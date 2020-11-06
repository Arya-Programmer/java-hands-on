package lessons2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pushing_Git {

	public static void main(String[] args) {
		Scanner in;
		try {
			in = new Scanner(new File("text.txt"));
		} catch (FileNotFoundException e) {
			in = new Scanner(System.in);
		}
		List<String> alies = new ArrayList<String>();
		
		while(in.hasNextLine()) {
			alies.add(in.nextLine());
		}
		
		for(String ali : alies) {
			System.out.println("name: " + ali);
		}

		
		in.close();
		
	}

}
