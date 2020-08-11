import java.util.Scanner;

public class Nsum {
	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		Integer n = new Integer(scan.nextInt());
		Integer sum = new Integer(0);
		
		while(n-- > 0) {
			sum += new Integer(scan.nextInt());
			}
		System.out.println(sum);
		scan.close();
	}
}