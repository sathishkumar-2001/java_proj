import java.util.*;

public class even_odd_prob {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		if (num % 2 == 0 ) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}
