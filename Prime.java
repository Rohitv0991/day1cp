import java. util.Scanner;
public class Prime {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		if(n <= 2) {
			System.out.println("Not Prime");
			return;
		}
		
		for(int i = 2; i <= n/2; i++) {
			if(n%i == 0) {
				System.out.println("Not Prime");
				return;
			}
		}	
		System.out.println("Prime");
		return;
	}
}
