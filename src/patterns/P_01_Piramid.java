package patterns;

import java.util.Scanner;

/**
 * 	row = 5
 * 		 *
 * 		***
 * 	   *****
 * 	  *******
 *   *********
 *   
 */
public class P_01_Piramid {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter the total numbers of row in the piramid : ");
			int row = sc.nextInt();
			
			for(int i=0; i<row; i++) {
				/**
				 * 	Print space
				 */
				for(int j=row-1; j>i; j--) {
					System.out.print(" ");
				}
				/**	
				 * 	row = 5
				 * 		*
				 * 	   **
				 *    ***
				 *   ****
				 *  *****
				 */
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}
				/**
				 * 	row = 5
				 * 
				 * 		*
				 * 		**
				 * 		***
				 * 		****
				 */
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
		}
	}

}
