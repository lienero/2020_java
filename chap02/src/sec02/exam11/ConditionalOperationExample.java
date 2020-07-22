package sec02.exam11;

import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수 입력");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 
			         (score > 70) ? 'C' : 'F');
		System.out.println(score + "점은 " + grade + "등급입니다.");

	}

}
