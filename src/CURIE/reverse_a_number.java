package CURIE;
import java.util.Scanner;
public class reverse_a_number {

	
	public static void main(String[] args) {
		int number=0;
		int reverse_number =0;
		System.out.println("Input number a number of your choice : ");
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
		while( number != 0 )
		{
		reverse_number = reverse_number * 10;
		reverse_number = reverse_number + number%10;
		number = number/10;
		}
		System.out.println("Reverse of input number is: "+reverse_number);

	}

}
