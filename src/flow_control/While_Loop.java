package flow_control;

import java.util.Scanner;

public class While_Loop {
	public static void main(String[] args) {
		int i,rev=0,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to reverse");
		i=sc.nextInt();
		while(i!=0) {
		r=i%10;
		rev=10*rev+r;
		i=i/10;
		}
		System.out.println("The number reversed is "+ rev);
	}
}
