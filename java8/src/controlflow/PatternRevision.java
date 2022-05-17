package controlflow;

public class PatternRevision {
	public static void printTriangle() {
		int rc = 4;
		int sc = 1;
//for row count
		for (int i = 0; i < rc; i++) {
			// for column count
			for (int j = 0; j < sc; j++) {
				System.out.print("* ");

			}
			sc++;
			System.out.println();

		}

	}

	public static void printSquare() {
		int rc = 4;
		int sc = 4;
		for (int i = 0; i < rc; i++) {
			for (int j = 0; j < sc; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}

	}

	public static void printReverseTriangle() {
		int rc = 4;
		int sc = 4;
		int bc = 0;
		for (int i = 0; i < rc; i++) {
			for (int k = 0; k < bc; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j < sc; j++) {
				System.out.print("*");
			}
			sc--;
			bc++;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printReverseTriangle();

	}

}
