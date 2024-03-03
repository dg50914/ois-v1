import java.util.*;

public class Gravitacija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	double distance = sc.nextDouble();
	double CM = 3.9857128 * (100000000000000L);
	double r = 6.371 * 1000000;

	double a = CM / Math.pow((r + distance), 2);
	System.out.println(a);
    }
}
