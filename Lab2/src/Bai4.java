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
		System.out.print("+----------------------------+\n");
		System.out.print("1. Giai phuong trinh bac 1\n");
		System.out.print("2. Giai phuong trinh bac 2\n");
		System.out.print("3. Tinh tien dien\n");
		System.out.print("4. Ket thuc\n");
		System.out.print("+----------------------------+\n");
		System.out.print("Chon chuc nang: ");
		int cn = scanner.nextInt();
		switch (cn) {
		case 1: {
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
			break;
		}
		case 2: {
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
			break;
		}
		case 3: {
			System.out.print("Nhap so dien: ");
			int a = scanner.nextInt();
			if(a<50) {
				System.out.print("Tien dien: ");
				System.out.printf("%d VND", a*1000);
			}else {
				System.out.print("Tien dien: ");
				System.out.printf("%d VND", 50*1000+(a-50)*1200);
			}
			break;
		}
		default:
			System.out.print("Ket thuc!");
		}
	}

}
