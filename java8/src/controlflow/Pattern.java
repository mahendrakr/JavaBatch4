package controlflow;

public class Pattern {
	public static void printTriangle() {
		int rc = 5;
		int sc = 1;
		for (int i = 0; i < rc; i++) {
			for (int j = 0; j < sc; j++) {
				System.out.print("* ");
			}
			sc++;
			System.out.println();
		}

	}
	public static void printReverseTriangle() {
		int rc=5;
		int sc=1;
		int bc=4;
		for(int i=0;i<rc;i++) {
			for(int k=0;k<bc;k++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<sc;j++) {
				System.out.print("*");
			}
			bc--;
			sc++;
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		//printTriangle();
		printReverseTriangle();
	}

}
