package array;
import java.util.Scanner;
import static java.lang.System.out;

public class A_01_JaggedArray {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			out.println("Enter how many row you want : ");
			int row = sc.nextInt();
			
			int[][] arr = new int[row][];
			
			for(int i=0; i<row; i++) {
				
				out.println("Enter how many column you want in " + i + "th row : ");
				int col = sc.nextInt();
				arr[i] = new int[col];
				
				out.println("Enter elements : ");
				for(int j=0; j<col; j++) {
					arr[i][j] = sc.nextInt();
				}
				out.println("");
				
			}
			
			out.println("Array elements are :----");
			for(int[] i : arr) {
				for(int k : i) {
					out.print(k);
				}
				out.println();
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}
