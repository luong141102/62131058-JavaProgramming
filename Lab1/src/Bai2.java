/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();
		System.out.printf("Chu vi: %d\n", (a+b)*2);
		System.out.printf("Dien tich: %d\n", a*b);
		System.out.printf("Canh nho nhat: %d", Math.min(a, b));
	}

}
