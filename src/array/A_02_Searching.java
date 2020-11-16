package array;

import java.util.Scanner;

public class A_02_Searching {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the size of array : ");
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			
			System.out.println("Enter elements in array : ----");
			for(int i=0; i<size; i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.println("enter the elements that you want to search : ");
			int item = sc.nextInt();
			
			boolean flag = false;
			for(int i=0; i<size; i++) {
				if(arr[i] == item) {
					System.out.println("Item is found at the position "+ (i+1));
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				System.out.println("item is not found");
			}
			
		}
	}

}
