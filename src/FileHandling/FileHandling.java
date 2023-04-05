package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) {
		File myfile= new File("src\\filecreation.txt");
		try {
			if(myfile.createNewFile()) {
				System.out.println("New file created");
			}
			else {
				System.out.println("File Already exists");
			}
		} catch (IOException e) {
			System.out.println("File was not able to be created");
			e.printStackTrace();
		}
	}
}
