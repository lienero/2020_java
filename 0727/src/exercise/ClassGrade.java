package exercise;

import java.util.Scanner;

public class ClassGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total = 0;
		
		//학급 수 class
		System.out.print("학급 수:");
		int classnum = sc.nextInt();
		int[] sum = new int[classnum];
		int[][] jumsu = new int[classnum][] ;
		
		for(int idx = 0; idx < jumsu.length; idx++  ) {
			System.out.print((idx + 1)+ "반의 학생 수:");
			int classone = sc.nextInt();
			jumsu = new int[classnum][classone] ;
			for (int i = 0; i < classone; i++) {
				System.out.print((idx + 1) + "반" + (i+1) + "번의 점수:");
				jumsu[idx][i] = sc.nextInt();
				sum[idx]= jumsu[idx][i];		
			}
		}
		
		System.out.println(" 반|합계 평균  ");
		for(int j = 0; j < jumsu.length; j++  ) {
			System.out.printf("%d 반 | %3d  %.2f",(j+1),sum[j],(sum[j]/jumsu[j].length));
			total += sum[j]; 
		}
		
		System.out.println(" 합|" +total+"  " +total/classnum);
		

	}

}
