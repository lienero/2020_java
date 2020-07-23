package star01;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;
		
		int sum = 0;
		
		Scanner scanner= new Scanner(System.in);
		
		while (run) {
			System.out.println("----------------------");
			System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
			System.out.println("----------------------");
			System.out.print("선택>");
			
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1 : 
				System.out.print("예금액>");
				sum += scanner.nextInt();
				break;
			case 2 : 
				System.out.print("출금액>");
				sum -= scanner.nextInt();
				break;
			case 3 :
				System.out.println("잔고>"+sum);
				break;
			case 4 :
				System.out.print("프로그램 종료");
				run = false;
				
				break;
			}
		}
	}	
}
