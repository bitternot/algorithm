import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		
		int i;
		for(i=0; i<arr.length; i++) {
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		   arr[i] = A+B;
	
		System.out.println("Case #"+(i+1)+": "+A+" + " +B+" = "+arr[i]);
		   
		}
	}
}
