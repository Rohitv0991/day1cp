import java.util.Scanner;

public class Fibo {
	public static void main(String args[]) {
		Scanner scan  = new Scanner (System.in);
		
		int n = scan.nextInt();
		scan.close();
		long a = 0, b = 1;
		
		if(n==0)return;
		else if(n == 1) {
			System.out.println(a);
			return;
		}
		else if(n == 2) {
			System.out.println(a+" "+b);
			return;
		}
		else {
			System.out.print(a+" "+b);
			while(n-- > 2){
				long c = a+b;
				System.out.print(" "+c);
				a = b;
				b = c;
			}
		}
		return;
	}
}