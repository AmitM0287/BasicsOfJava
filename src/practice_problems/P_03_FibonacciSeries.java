package practice_problems;

import java.util.Scanner;
import static java.lang.System.out;

public class P_03_FibonacciSeries {

	static void fibo(int range) {
		int a = 1, b = 1, k = 0;
		out.print(a + " " + b + " ");
		
		while(k < range){
			k = a+b;
			a = b;
			b = k;
			out.print(k + " ");
		}
	}
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			out.print("Enter ending range : ");
			int range = sc.nextInt();
			
			fibo(range);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
