package pattren;

import java.util.Scanner;

public class Star4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row");
		int row= sc.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=2*i; j++) {
				
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}

/*enter the row
enter the row
5

* * 
* * * * 
* * * * * * 
* * * * * * * * 
*/
