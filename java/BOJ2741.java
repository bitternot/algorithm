import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
		int[] arr = new int[T];
		
		for(int i=0; i<arr.length; i++) {
		    arr [i] = i+1;
		    
    }
	    for(int j : arr){
	        System.out.println(j);
	    }
	}
}
