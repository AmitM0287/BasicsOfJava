package practice_problems;

import java.util.Scanner;
import static java.lang.System.out;

public class P_01_PrimeOrNot {
	
	static void check(int num) {
		
		if(num < 0) {
			out.println("Invalid Input!");
			
		}else if(num ==1) {
			out.println("Not a Prime Number!");
			
		}else {
			int flag=0;
			
			for(int i=2; i<=num; i++) {
				if(num % i == 0) {
					flag++;
				}
			}
			
			if(flag == 1) {
				out.println("Prime Number!");
				
			}else {
				out.println("Not a Prime Number!");
				
			}
		}
		
	}

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){
			
			out.println("Enter an Integer number : ");
			int num = sc.nextInt();
			
			check(num);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
