package array;

import java.util.Scanner;

public class A_03_PairOfSum {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter the size of array : ");
			int size = sc.nextInt();
			int[] arr = new int[size];
			
			System.out.println("Enter elements in array : ----");
			for(int i=0; i<size; i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.println("Enter the number to find pairs : ");
			int item = sc.nextInt();
			
			
			for(int i=0; i<size-1; i++) {
				for (int j=0; j<size-1; j++) {
					int sum = arr[i] + arr[j+1];
					
					if(sum == item) {
						System.out.println(arr[i] + " , " + arr[j+1]);
						break;
					}
				}
				
				
			}
		}
	}

}
