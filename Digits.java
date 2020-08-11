import java.util.*;
public class Digits {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int sum = 0;
		while(n>0) {
			int d = n%10;
			sum += d;
			n = n/10;
		}
		System.out.println(sum);
	}
}