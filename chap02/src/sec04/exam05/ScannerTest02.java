package sec04.exam05;

import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		String name;
		int num;
		String tel;
		
		System.out.println("[필수 정보 입력]");
		System.out.print("이름:");
		name = sc1.nextLine();
		System.out.print("주민번호 앞 6자리:");
		num = sc1.nextInt();
		System.out.print("전화번호:");
		tel = sc2.nextLine();
		
		System.out.println();
		System.out.println("[입력된 내용]");
		System.out.println("이름:" + name);
		System.out.println("주빈번호 앞 6자리:" + num);
		System.out.println("전화:" + tel);

	}

}
