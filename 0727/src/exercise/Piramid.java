package exercise;

import java.util.Scanner;

public class Piramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("숫자 피라미드를 표시합니다.");
		System.out.print("단수는:");
		int n = stdIn.nextInt();
		for(int i = 1; i < n; i++) {
			for(int j = 1; j <= n -i; j++) {
				System.out.print(' ');
			}	
			for(int k = 1; k <= 2*i -1; k++ ) {
				System.out.print(i % 10);
			}
			System.out.println();
		}

	}

}
