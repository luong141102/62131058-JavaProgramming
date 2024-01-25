/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhap b: ");
		double b = scanner.nextDouble();
		if(a==0) {
			if(b==0) {
				System.out.print("Vo nghiem");
			}else {
				System.out.print("Vo so nghiem");
			}
		}else {
			System.out.print("Nhiem cua phuong trinh bac nhat ax+b\n");
			System.out.printf("x = %f", -b/a);
		}
	}
}
