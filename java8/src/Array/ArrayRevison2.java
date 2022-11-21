package Array;
//convert this by normal for loop
//int[] arr2= {1,2,3,4,5,6,7,8,9};
public class ArrayRevison2 {

	public static void main(String[] args) {
		int[][][] arr=new int[2][3][4];
		System.out.println(arr[0][2][1]);
		
		System.out.println("-----------");
		
//		for(int[][] a:arr) {
//			for(int[] b:a ) {
//				for(int c:b) {
//					System.out.println(c); 
//				}
//			}
			
			System.out.println("*****************");
			
			
//		}
		 for(int i=0;i<2;i++) {
			 for(int j=0;j<3;j++) {
				 for(int k=0;k<4;k++) {
					 System.out.print(arr[i][j][k]+",");
			 }
		 }
		 }
		System.out.println();
                     
	}

}
