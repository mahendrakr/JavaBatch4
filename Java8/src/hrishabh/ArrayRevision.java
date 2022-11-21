package hrishabh;

public class ArrayRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(arr);
		System.out.println(arr[3]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
			i++;
		}
		;
		System.out.println("--------------");
		
		// 1st way to initialize 2d Array
		
		int[][] Arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };
		System.out.println(Arr[1][4]);
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr.length; j++) {
				System.out.println(Arr[i][j]);
			}
			System.out.println();
		}
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Arr.hashCode());
		
		// second way to initialize 2d Array
		
		int[][] Arr1 = new int[5][5];
		Arr1[3][1] = 1;
		
		// System.out.println( Arr1[3][1]);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Arr1[0][0]);
		for (int i = 0; i < Arr1.length; i++) {
			for (int j = 0; j < Arr1.length; j++) {
				System.out.println(Arr1[i][j]+" ");
			}
			;
			System.out.println();
		}
		;
		System.out.println(Arr1.hashCode());
        
		System.out.println("-------------------");
		
		//3d or multidiamentnaol Array
		
		int[][][] Arr3=new int [3][3][3];    //first way to creat 3d Array
		Arr3[0][0][0]=1;
		Arr3[0][0][1]=2;
		Arr3[0][0][2]=3;
		Arr3[0][1][0]=4;
		Arr3[0][1][1]=5;		
		Arr3[0][1][2]=6;
		Arr3[0][2][0]=7;
		Arr3[0][2][1]=8;
		Arr3[0][2][2]=9;
		Arr3[1][0][0]=10;
		Arr3[1][0][1]=11;
		Arr3[1][0][2]=12;
		Arr3[1][1][0]=13;
		Arr3[1][1][1]=14;
		Arr3[1][1][2]=15;
		Arr3[1][2][0]=16;
		Arr3[1][2][1]=17;
		Arr3[1][2][2]=18;
		Arr3[2][0][0]=19;
		Arr3[2][0][1]=20;
		Arr3[2][0][2]=21;
		Arr3[2][1][0]=22;
		Arr3[2][1][1]=23;
		Arr3[2][1][2]=24;
		Arr3[2][2][0]=25;
		Arr3[2][2][1]=26;
		Arr3[2][2][2]=27;
		
		int[][][] arr3 = { { 
			{ 12, 34, 56 },
			{ 78, 89, 90 }, 
			{ 21, 32, 43 }
			} };
          //second way to creat 3d Array
		System.out.println(Arr3);
		System.out.println(arr3);
		System.out.println(Arr3[2][2][2]);
		System.out.println(arr3[0][1][2]);
		
		for(int i=0; i<Arr3.length;i++) {
			for(int j=0; j<Arr3.length;j++) {
				for (int k=0; k<Arr3.length;k++) {
					System.out.print(Arr3[i][j][k]+" ");
				};
			};
			System.out.println();	
		};
		
		for(int[]Ar:Arr1) {
			System.out.print(Ar+" ");
			}
		System.out.println();
}
	 
	}