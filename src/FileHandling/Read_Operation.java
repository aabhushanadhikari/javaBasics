package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_Operation {
	public static void main(String[] args) {
		File myfile= new File("src//filecreation.txt");
		try {
			Scanner sc= new Scanner(myfile);
			while(sc.hasNextLine()) {
				String line=sc.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
