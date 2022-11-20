package Array;

//find max and min value from given array {10,5,4,50,12,80,55}
public class ArrayV2 {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 4, 50, 12, 80, 55 };
		System.out.println(arr[2]);
		/**
		 * step 1: iterate the array(loop) 
		 * step2: take first element of array 
		 * step3:compare it to next elements of array. 
		 * step4: if selected element is less than nextelement then swap the element.and proceed further. Step5: repeat step
		 * 3,4 till end of the array.
		 * 
		 * 
		 */
	int a = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (a < arr[i]) {
				a = arr[i];

			}

		}	
		System.out.println(a);

	}
}
