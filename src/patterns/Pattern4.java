package patterns;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 
 pattern 4
        * 
      * * * 
    * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
 */	

		for(int i=1;i<=3;i++) {
			for(int space=4;space>=i;space--) {
				System.out.print("  ");
			}
			for(int k=1;k<(i*2);k++) {
				System.out.print("* ");
			}
	         System.out.println();
		
		}
		
		for(int i=1;i<=4;i++) {
			for(int space=1;space<=i;space++) {
				System.out.print("  ");
			}
			for(int k=9;k>(i*2);k--) {
				System.out.print("* ");
			}
	         System.out.println();
		
		}
	}

}
