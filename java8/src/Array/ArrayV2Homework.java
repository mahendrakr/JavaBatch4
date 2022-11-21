package Array;

public class ArrayV2Homework {
//
	public static void main(String[] args) {
		int[][] arr = {
				{10,20},{30},{40,50}	
		};
		System.out.println(arr[1][0]);
		System.out.println(arr[2][1]);
		System.out.println("**********************************************");
		
		int[][][] arr2= {
				{{10,20}},{{30}},{{40,50}},{{60}},{{70,80}},{{90}}
				
	 };
		System.out.println(arr2[3][0][0]);
		System.out.println(arr2[4][0][1]);
		System.out.println(arr2[0][0][1]);
		System.out.println(arr2[2][0][0]);
		System.out.println("**********************************************");
		
		//using enhance for loop
		for(int[][] a:arr2) {
			for(int[] b:a) {
				for(int c:b) {
					System.out.print(c+" ");
				}
			}
		}
	}
}
