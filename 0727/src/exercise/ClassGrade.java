package exercise;

import java.util.Scanner;

public class ClassGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total = 0; // 총합 
		int count = 0; // 배열 전체 길이 
		int sum = 0;	// 점수의 합계
		
		//학급 수 class
		System.out.print("학급 수:");
		int classnum = sc.nextInt();
		int[] sumArray = new int[classnum];
		int[][] jumsu  = new int[classnum][] ;
		
		
		// 반복문으로 반 점수 입력
		for(int idx = 0; idx < jumsu.length; idx++  ) {
			System.out.print((idx + 1)+ "반의 학생 수:");
			int classone = sc.nextInt();
			jumsu[idx] = new int[classone] ;
			for (int i = 0; i < classone; i++) {
				System.out.print((idx + 1) + "반" + (i+1) + "번의 점수:");
				jumsu[idx][i] = sc.nextInt();
				sum += jumsu[idx][i];
				sumArray[idx] = sum;
				count++;	// 배열 전체 길이 입력
			}
			// 합계갑 초기화
			sum = 0;
		}
		
		// printf 활용하여 반 합계 평균 출력
		System.out.println(" 반| 합계 평균  ");
		for(int j = 0; j < jumsu.length; j++  ) {
			System.out.printf("%d반| %d  %.1f%n",(j+1),sumArray[j],((double)sumArray[j]/jumsu[j].length));
			total += sumArray[j]; 
		}
		System.out.printf(" 합| %d  %.1f", total, (double)total/count);
		

	}

}
