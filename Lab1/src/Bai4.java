/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap phuong trinh bac 2: a= ");
		int a = scanner.nextInt();
		System.out.print("b= ");
		int b = scanner.nextInt();
		System.out.print("c= ");
		int c = scanner.nextInt();
		double d = Math.pow(b, 2)-4*a*c;
		System.out.printf("Delta = %f\n", d);
		System.out.printf("Can Delta = %f", Math.sqrt(d));
	}

}
