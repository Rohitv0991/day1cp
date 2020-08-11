import java.util.Scanner;

public class Armstrong {
	public static int numLength(int n) {
		if(n<1000) {
			if(n<100) {
				if(n<10) return 1;
				else return 2;
			}
			else return 3;
		}
		else if(n<1000000) {
			if(n<100000) {
				if(n<10000) return 4;
				else return 5;
			}
			else return 6;
		}
		else if(n<1000000000) {
			if(n<100000000) {
				if(n<10000000) return 7;
				else return 8;
			}
			else return 9;
		}
		
		else return 10;
	}
	
	public static boolean armstrong(int n) {
		int len = numLength(n);
		int x = n;
		int check = 0;
		for(int i = 0; i < len; i++) {
			int d = n % 10;
			n = n / 10;
			check += (int)Math.pow(d, len);
		}
		return (x == check)?true:false;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		System.out.println(armstrong(n)?"True":"False");
	}
}