package exercise;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("사람 수:");
		int classmate = sc.nextInt();
		
		int[] jumsu = new int[classmate] ;
		System.out.println("점수를 입력하세요");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print((i+1) + "번의 점수:");
			jumsu[i] = sc.nextInt();
			sum += jumsu[i];			
		}
		
		int max = jumsu[0]; 
		int min = jumsu[0];
		
		for(int j = 1; j < jumsu.length; j++ ) {
			if(jumsu[j] > max) {
				max = jumsu[j];
			}
			if(jumsu[j] < min ) {
				min = jumsu[j];
			}
		}
		
		System.out.println("합계는 "+sum+"입니다.");
		System.out.println("평균은 "+(sum/classmate)+"입니다.");
		System.out.println("최고점은" +max+ "입니다");
		System.out.println("최저점은" +min+ "입니다");
	}

}
