package star01;

public class Starz {

	public static void main(String[] args) {
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
