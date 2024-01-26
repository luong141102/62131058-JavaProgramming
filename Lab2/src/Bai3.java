/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so dien: ");
		int a = scanner.nextInt();
		if(a<50) {
			System.out.print("Tien dien: ");
			System.out.printf("%d VND", a*1000);
		}else {
			System.out.print("Tien dien: ");
			System.out.printf("%d VND", 50*1000+(a-50)*1200);
		}
	}

}
