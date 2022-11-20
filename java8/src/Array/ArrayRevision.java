package Array;

public class ArrayRevision {

	public static void main(String[] args) {
     long[] arr=new long[5];
     String[] arr1=new String[10];
     int[] arr2=new int[5];
     System.out.println(arr[2]);
     System.out.println(arr[4]);
     System.out.println(arr[1]);
     
     System.out.println("*************");
     
     
     for(int i=0;i<5;i++) {
    	 System.out.println(arr[i]);
     }
     System.out.println("Using enhance for loop"); 
     
     for(int a: arr2 ) {
    	 System.out.println(a);
     }
     
     System.out.println("***********************");
     arr2[3]=30;
     arr2[1]=20;
     arr2[4]=50;
     for(int b:arr2) {
    	 System.out.println(b);
     }
     
     int[][] arr3=new int[2][2];
     //System.out.println(arr3[0][1]);
    // System.out.println(arr3[2][0]);
     
     for(int[] a:arr3) {
    	 for(int b:a) {
    		 System.out.println(b);
    	 }
     }
      System.out.println("****************");
      
      for(int i=0;i<2;i++) {
    	  for(int j=0;j<2;j++) {
    		  System.out.println(arr3[i][j]);
    	  }
    	       }
 
 
     
	}

}
