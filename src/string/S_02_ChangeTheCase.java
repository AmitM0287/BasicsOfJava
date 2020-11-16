package string;

import java.util.Scanner;

public class S_02_ChangeTheCase {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.print("Enter a String : ");
			String str = sc.nextLine();
			char[] arr = str.toCharArray();
			
			String res = "";
			// a = 97 z = 122 // A = 65 Z = 90
			for(int i=0; i<arr.length; i++) {
				int ch = (int)arr[i];
				
				if(ch>=65 && ch<=90) {
					ch += 32;
					res += String.valueOf(((char)ch));
					
				}else if(ch>=97 && ch<=122) {
					ch -= 32;
					res += String.valueOf(((char)ch));
					
				}else {
					res += String.valueOf(((char)ch));
				}
			}
			
			System.out.println("Modified String is : " + res);
			
		}catch(Exception e) {
			System.out.println("Invalid Input!");
		}

	}

}
