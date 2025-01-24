
public class Pattern4 {

	public static void main(String[] args) {
   for( int r=1,sp=10;r<=10;r++) {
	   for (int a=1;a<sp;a++) {
		   System.out.print(" ");
	   }
	   sp=sp-1;
	   for( int c=1;c<=r;c++) {
		   System.out.print(" 90");
	   }
	   System.out.println();
   }
	}

}
