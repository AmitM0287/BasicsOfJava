package string;

import java.util.Scanner;

public class S_01_PalindromeString {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			//	Declare variables
			System.out.print("Enter a String : ");
			String input = sc.nextLine();
			String str = "";
			
			//	Reverse the String
			for(int i=input.length()-1; i>=0; i--) {
				str += input.charAt(i);
			}
			
			//	Check both Strings are equal or not
			if(str.equalsIgnoreCase(input)) {
				System.out.println(input + " is a Palindromic String. ");
				
			}else {
				System.out.println(input + " not a Palindromic String");
			}
			
		}catch(Exception e) {
			System.out.println("Invalid Input!");
		}
	}

}
