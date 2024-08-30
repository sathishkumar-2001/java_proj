import java.util.*;

public class method_overloading {
	static int plusmethod(int x , int y) {
		return x + y;
	}

	static double plusmethod(double x , double y) {
		return x + y;
	}

	public static void main(String[] args) {
		double ans = plusmethod(5.4,6.2);
		System.out.println(ans);
	}
}
