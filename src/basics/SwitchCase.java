package basics;

import java.util.Scanner;

public class SwitchCase {
		public static void main(String[] args) {
			String gender,opinion;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your gender");
			gender=sc.nextLine();
			switch(gender) {
			case "male":
				System.out.println("Do you like women?");
				opinion=sc.nextLine();
				if(opinion.equals("yes")) {
					System.out.println("You are a straight man");
				}
				else if(opinion.equals("no")) {
					System.out.println("You are a gay man");
				}
				else {
					System.out.println("The opinion you have given is neither yes nor no");
				}
				break;
			case "female":
				System.out.println("Do you like men?");
				opinion=sc.nextLine();
				if(opinion.equals("yes")) {
					System.out.println("You are a straight woman");
				}
				else if(opinion.equals("no")) {
					System.out.println("You are a gay woman");
				}
				else {
					System.out.println("The opinion you have given is neither yes nor no");
				}
				break;

				
			}
		}
}
