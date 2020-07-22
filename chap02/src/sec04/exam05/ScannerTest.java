package sec04.exam05;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws Exception{
		try (// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)) {
			String name;
			int age;
			String tel;
			
			System.out.println("이름을 입력하세요");
			name = scanner.nextLine();
			System.out.println("나이를 입력하세요");
			age = scanner.nextInt();
			System.out.println("전화번호를 입력하세요");
			tel = scanner.next();
			
			System.out.println("이름:" + name);
			System.out.println("나이:" + age);
			System.out.println("전화:" + tel);
		}
	}

}
