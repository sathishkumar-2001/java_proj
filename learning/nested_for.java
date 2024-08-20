import java.util.*;

public class nested_for {
	public static void main(String[] args) {
		for(int i=0 ; i < 10 ; i++){
			System.out.println("outer: "+ i);

			for (int j=0 ; j < 2 ; j++) {
				System.out.println("inner " + j);
			}
		}
	}
}
