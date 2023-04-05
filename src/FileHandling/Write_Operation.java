package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Write_Operation {
	public static void main(String[] args) {
		try {
			FileWriter fileWriter= new FileWriter("src//filecreation.txt");
			fileWriter.write("Hello World");
			System.out.println("Written successfully!!!");
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Could not write in the file");
			e.printStackTrace();
		}
	}
}
