import java.util.ArrayList;
import java.util.Scanner;
//import java.math.*;
public class Nprime {
	static int max = 99999999;
	static ArrayList<Integer> primesList = new ArrayList<Integer>();
	
	static void sieveOfErastosthenes() {
		boolean[] isPrime = new boolean[max];
		
		for(int i = 0; i < max; i++) {
			isPrime[i] = true;
		}
		for(int p = 2; p * p < max; p++) {
			if(isPrime[p] == true) {
				for(int i = p * p; i < max; i += p) {
					isPrime[i] = false;
				}
			}
		}
		for(int p = 2; p < max; p++) {
			if(isPrime[p] == true) primesList.add(p);
		}
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		
		sieveOfErastosthenes();
		
		try {
		System.out.println(primesList.get(N-1));
		}
		catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		// commented also works but is slow
		/*BigInteger prime = BigInteger.valueOf(0);
		
		for(int i = 0; i < N; i++) {
			prime = prime.nextProbablePrime();
		}
		System.out.println(prime);*/
	}
}