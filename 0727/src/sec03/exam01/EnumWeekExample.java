package sec03.exam01;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;
		
		// getInstance() : 시스템 날짜 불러오기
		Calendar cal = Calendar.getInstance();
		// DAY_OF_WEEK : 일주일을 숫자로 반환
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		// today 변수에 열거타입 삽입
		switch (week) {
		case 1 : 
			today = Week.SUNDAY; break;
			
		case 2 :
			today = Week.MONDAY; break;
			
		case 3: 
			today = Week.TUESDAY; break;
			
		case 4:
			today = Week.WEDNESDAY; break;
			
		case 5: 
			today = Week.THURSDAY; break;
		
		case 6:
			today = Week.FRIDAY; break;
			
		case 7:
			today = Week.SATURDAY; break;
		}
		
		// 오늘 요일 출력
		System.out.println("오늘 요일:" + today);
		
		// 일요일일 시 tv시청
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 TV 시청을 합니다");
		} else {
			System.out.println("월요일부터 금요일까지는 열심히 자바공부를 합니다.");
		}

	}

}
