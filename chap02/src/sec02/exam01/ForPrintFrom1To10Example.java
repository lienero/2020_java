package sec02.exam01;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		for(int i=1; i<=100; i++) {
			sum = sum + i; 
		}
		System.out.println("정답은" + sum);
	}

}
