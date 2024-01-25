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
		System.out.print("Nhap a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhap b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhap c: ");
		double c = scanner.nextDouble();
		double d = Math.pow(b, 2)-4*a*c;
		if(a==0) {
			if(b==0) {
				if(c==0) {
					System.out.print("Vo nghiem");
				}else {
					System.out.print("Vo so nghiem");
				}
			}else {
				System.out.print("Nhiem cua phuong trinh bac nhat ax+b\n");
				System.out.printf("x = %f", -c/b);
			}
		}else {
			System.out.printf("Delta = %f\n", d);
			if(d<0) {
				System.out.print("Phuong trinh vo nghiem");
			}else {
				if(d==0) {
					System.out.printf("Phuong trinh co nghiem kep x = %f", -b/(2*a));
				}else {
					System.out.print("Phuong trinh co 2 nghiem phan biet:\n");
					System.out.printf("x1= %f\n", (-b+Math.sqrt(d))/(2*a));
					System.out.printf("x2= %f\n", (-b-Math.sqrt(d))/(2*a));
				}
			}
		}
	}

}
