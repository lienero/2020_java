package star01;

public class Ohwdie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정삼각형
		for (int i=1; i<=3; i++) {
			int k = (4- i);
			while(k>0) {
				System.out.print(" ");
				k--;
			}
			
			for(int j=1; j<=3; j++) {
				if(i>=j) {
					System.out.print("*");
				}
			}
			for(int j=1; j<=3; j++) {
				if(i>j) {
					System.out.print("*");
				}
			}
			for(int l= (4-i); l>0; l--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		// 거꾸로 정삼각형
		for (int i=2; i>=1; i--) {
			int k = (4-i);
			while(k>0) {
				System.out.print(" ");
				k--;
			}
			
			for(int j=3; j>=1; j--) {
				if(i>=j) {
					System.out.print("*");
				}
			}
			for(int j=3; j>=1; j--) {
				if(i>j) {
					System.out.print("*");
				}
			}
			for(int l= (4-i); l>0; l--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
