import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int A = sc.nextInt();
	   int B = sc.nextInt();
	   int C = sc.nextInt();
     
	     if((A == B) && (B == C)) {
	       System.out.println(10000+A*1000);
	   } else if((A == B) || (B == C) || (C == A)) {
	       int same = (B == C)? B : A;
	       System.out.println(1000+same*100);
	   } else {
	       int max = A;
	       if((B>max) && (B>C)) max = B;
	       if((C>max) && (C>B)) max = C;
	       System.out.println(max*100);
	   }
	}
}
