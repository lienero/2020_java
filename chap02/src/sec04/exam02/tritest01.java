package sec04.exam02;

public class tritest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 5; i>=1; i--) {
	         for(int j=1; j<=5; j++) {
	            if(j>=i) {
	               System.out.print("*");
	            } else {
	               System.out.print(" ");
	            }
	         }
	         System.out.println();
	       
		}
	}

}
