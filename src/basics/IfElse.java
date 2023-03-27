package basics;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		String gender;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your gender");
		gender=sc.nextLine();
		if(gender.equals("male")) {
			System.out.println("You are a male");
		}
		else if(gender.equals("female")){
			System.out.println("You are a female");
		}
		else {
			System.out.println("The gender you have given is neither fale nor female");
		}
	}
}
