import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		
		int i;
		for(i=0; i<arr.length; i++) {
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		   arr[i] = A+B;
		}
		for(i=0; i<arr.length; i++)
		System.out.println("Case #"+(i+1)+": "+arr[i]);
		   
		}
	}
