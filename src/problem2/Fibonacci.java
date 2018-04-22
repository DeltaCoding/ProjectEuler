package problem2;

public class Fibonacci {
	
	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		int sum = 2;
		
		while(i + j <= 4000000) {
			int tmp = i + j;
			i = j;
			j = tmp;
			
			System.err.println("i: " + i + " j: " + j + " tmp: " + tmp);
			
			if((tmp % 2) == 0) {
				sum += tmp;
			}
		}
		
		System.out.println(sum);
	}
	
}
