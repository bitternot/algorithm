import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] arr = new String[T+1];
	  String star = "*";
	    	    
		for(int i=1; i<arr.length; i++){
		arr[0] = star;
		arr[i] = arr[i-1] + star;
		
		System.out.println(arr[i-1]);
		   
		}
	}
}
