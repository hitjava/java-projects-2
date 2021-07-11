package CURIE;
import java.util.Scanner;
public class while_loop {

	
	public static void main(String[] args) {
		int num, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer Value below 10: ");
		num = sc.nextInt();
		while (num <= 10) {
		sum = sum + num;
		num++;
		}
		System.out.println(" Sum of the Numbers is: %d "+sum);

	}

}
