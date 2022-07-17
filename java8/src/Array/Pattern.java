package Array;

public class Pattern {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int count=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[count++] +" ");
				
			}
			System.out.println();
		}
	}

}
