package Array;

public class ArrayV3 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		System.out.println(arr[3]);
		// two dimensional

		int[][] arr2 = { { 10, 20 }, { 4, 5, 6 }, { 7 }

		};
		System.out.println(arr2[1][1]);
		System.out.println(arr2[0][1]);
		System.out.println(arr2[2][0]);

		// 3rd dimensional
		int[][][] arr3 = { { { 1, 2 }, { 3 } }, { { 4, 5, 6 } }, { { 7, 8 }, { 9 }, { 10 } } };
		System.out.println("****************");
		System.out.println("****************");
		System.out.println(arr3[2][1][0]);
		System.out.println(arr3[0][1][0]);

		System.out.println("******");

		int[][][] arr4 = { { { 10, 20 } }, { { 30 } }, { { 40, 50 } }, { {} } };
	}
}