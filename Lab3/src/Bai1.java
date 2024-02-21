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
		System.out.print("Nhap n: ");
		int n = scanner.nextInt();
		boolean ok = true;
		for(int i=2; i<n;i++) {
			if(n%i==0) {
				ok = false;
				break;
			}
			i++;
		}
		if(ok) {
			System.out.printf("%d la so nguyen to", n);
		}else {
			System.out.printf("%d khong phai la so nguyen to", n);
		}
	}

}
