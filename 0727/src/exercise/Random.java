package exercise;

import java.util.*;
import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean retry = true;
		int count = 0;
		int vcount = 0;
		int dcount = 0;
		
		while(retry) {
			// 내가 낸 가위바위보 입력
			System.out.print("내가 낸 것: ");
			String bo = sc.next();
			String bye = new String();
			
			// 랜덤 함수로 컴퓨터가 가위바위보 입력
			System.out.print("컴퓨터가 낸 것:");
			int hand = (int) (Math.random() * 2);
			
			switch (hand) {
			case 0: 
				System.out.println("가위"); 
				bye = "가위";
				break;
			case 1: 
				System.out.println("바위"); 
				bye = "바위";
				break;
			case 2:
				System.out.println("보");
				bye = "보";
				break;
			}
			
			// 내가 낸 가위바위보와 컴퓨터가 낸 가위바위보
			if(bo.equals(bye)) {
				System.out.println(bo + "vs" + bye  +"로 결과는 무승부!");
				count =+ 1;
			} else if ((bo.equals("가위") && bye.equals("보"))
					    || (bo.equals("바위") && bye.equals("가위"))
					    || (bo.equals("보") && bye.equals("바위"))) {
				System.out.println(bo + "vs" + bye  +"로 결과는 승리!");
				vcount += 1;
			 } else {
				System.out.println(bo + "vs" + bye  +"로 결과는 패배!");
				dcount += 1;
			 }
			
			// 승리횟수, 패배횟수 count 추가
			
			System.out.println("현재 승리횟수:" +vcount);
			System.out.println("현재 패배횟수:"  +dcount);
			
			// 재시도 질문 (boolean)
			System.out.println("다시 하시겠습니까?(Y/N)");
			char rtry = sc.next().charAt(0);
			if(rtry == 'N') {
				retry = false;
			}
			
			
		}
	}		

}
