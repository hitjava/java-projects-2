package CURIE;

public class sum_elements_of_an_array {

	
	public static void main(String[] args) {
		int[] i = {10, 20, 30, 40, 50, 10};
		int sum = 0;
		for( int num : i) {
		sum = sum+num;
		}
		System.out.println("Sum of array elements is:"+sum);

	}

}
