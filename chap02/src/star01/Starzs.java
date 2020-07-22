package star01;

public class Starzs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num =1; num<=4; num++) {
			System.out.println();
			for(int numb=1; numb<=4; numb++) {
				if(num >= numb) {
					System.out.print("*");
				}	
			}
		}
		for (int i=1; i<=4; i++) {
			System.out.println();
			int k = i-1;
			while(k>=1) {
				System.out.print(" ");
				k--;
			}
			for(int j=4; j>=1; j--) {
				if(i<=j) {
					System.out.print("*");
				} 
			}
		}
	}

}
