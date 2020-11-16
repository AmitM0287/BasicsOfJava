package practice_problems;

import java.util.Scanner;

public class P_04_EvenOrOdd {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.print("Enter a number : ");
			int num = sc.nextInt();
			
			if(num%2 == 0){
				System.out.println(num + " is a even number!");
				
			}else if(num < 0) {
				System.out.println("Invalid Number!");
				
			}else {
				System.out.println(num + " is a odd number!");
			}
			
		}catch(Exception e) {
			System.out.println("Invalid Input!");
			
		}
	}
}
