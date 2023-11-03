package pattren;

import java.util.Scanner;

public class Star3 {
public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the row");
//		int row= sc.nextInt();
//		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<2*i; j++) {
				
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}

/*
 * enter the row
5
* 
* * * 
* * * * * 
* * * * * * * 
* * * * * * * * * */
