package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Append {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Write a new dats you want to add");
			String newWord=sc.next();
			try {
				FileWriter writer=new FileWriter("src//filecreation.txt");
				writer.append(newWord);
				System.out.println("Data written successfully");
				writer.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
