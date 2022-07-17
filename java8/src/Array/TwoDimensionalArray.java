 package Array;
/**Note---> 1.Find length of an array.(1d)
 *          eg:  arr.length
 *          find length of 2-d
 *          eg: arr[0].length
 *          find length of 3-d.
 *          eg: arr[0][0].length
 *          find length of 4-d
 *          eg: arr[0][0][0].length.
 * 
 * @author Hp
 *
 */
         
public class TwoDimensionalArray {

	public static void main(String[] args) {
    int[][] arr=new int[2][3];                                                                           
    // insert elements in two-d array.
    arr[0][1]=40;
    arr[0][0]=10;
    arr[1][0]=20;
    arr[1][1]=50;
    System.out.println(arr);
    System.out.println(arr[0]);
    // access all the elements of 2-d
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr[i].length;j++)
    	{                 
    		System.out.println(arr[i][j]);
    	}
    }
    System.out.println("********");
    
    int[][][] arr1=new int[4][3][2];
    System.out.println(arr1.length);
    System.out.println(arr1[0].length);
    System.out.println(arr1[0][0].length);
    System.out.println(arr1); // [[[I@.........  hascode will generate
    System.out.println(arr1[0]); //[[I@......
    System.out.println(arr1[0][0]);//[I@
    
    int[][] arr2=new int[3][];
    System.out.println(arr2.length);
   // System.out.println(arr2[0].length);
    System.out.println(arr2[0]);
    
    
	}

}
