/**
 * 
 */
public class Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Bang Cuu Chuong\n");
		for(int i=1; i<=9;i++) {
			System.out.printf("Bang Cuu Chuong %d\n", i);
			for(int j=1;j<=10;j++) {
				System.out.printf("%d x %d = %d", i, j, i*j);
				System.out.println();
			}
			System.out.println();
		}
	}

}
