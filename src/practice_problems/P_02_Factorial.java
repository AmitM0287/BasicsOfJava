package practice_problems;

import static java.lang.System.out;
import java.util.Scanner;

public class P_02_Factorial {
	
	static int fact(int num) {
		
		if(num < 1) {
			return 1;
			
		}else {
			return num*fact(num-1);
			
		}
		
	}

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){
			
			out.print("Enter an Integer Number : ");
			int num = sc.nextInt();
			
			out.println("Factorial is : " + fact(num));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
