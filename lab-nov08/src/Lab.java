import java.util.*;

public class Lab {
		
	public static void main(String[] args) {
		if(args.length ==1) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(args[0]);
		int[] arr = new int[count];
		Random rn = new Random();
		for(int i=0; i < count; i++) {
			arr[i] = rn.nextInt(100);
		}
		for(int i=0; i < count; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------------------");
		
		int userInput = count;
		for(int i=0; i < userInput; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("------------------------");
		for(int i=0; i < userInput; i++) {
			System.out.println(arr[i]);
		}
		}else {
			
			System.out.println("Error");
			return;
		}
	}
}
