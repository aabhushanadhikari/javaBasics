package FileHandling;

import java.io.File;

public class Delete_Operation {
	public static void main(String[] args) {
		File myfile=new File("filecreation.txt");
		if(myfile.delete()) {
			System.out.println("File Deleted Successfully");
		}
		else {
			System.out.println("Due to some kind of external error,file was not able to be deleted");
		}
		}
		
	}

