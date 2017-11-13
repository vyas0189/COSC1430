import java.util.Scanner;

public class Summation {
	public static void main(String[] args) {
		System.out.println("Sum");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter​ ​value​ ​for​ ​x:​ ​");
		int x = sc.nextInt();
		System.out.print("Enter​ ​value​ ​for​ ​n:​ ​"); 
		int n = sc.nextInt();
		
		System.out.println("The sum is: " + sum(x,n));
	}
	public static int sum(int k, int n) {
		int sum =0;
		for(int i=0; i <=n;i++) {
			sum += i*k;
		}
		return sum;
	}
}
