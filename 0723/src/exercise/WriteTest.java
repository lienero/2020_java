package exercise;

import java.io.*;

public class WriteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fr = new FileWriter("test.txt");
			fr.write("안녕하세요? 저는 자바를 배웁니다.\n" 
					 + "만나서 반갑습니다.\n" 
					 + "파일쓰기 잘 되지요?");
			fr.close();
			System.out.println("파일 쓰기에 성공했습니다.");
		} catch (IOException e) {
			System.out.println("에러가 발생했습니다.");
			e.printStackTrace();
		}

	}

}
