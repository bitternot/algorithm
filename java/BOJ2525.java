import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int A = sc.nextInt();
	   int B = sc.nextInt();
	   int C = sc.nextInt();
        
	   int h=A*60;
	   int ansH = (h+B+C)/60;
	   int ansM = (h+B+C)%60;
	   
     if(ansH >= 24) {
	      ansH %= 24;
	      System.out.println(ansH+" "+ansM);
	  }else {
	      System.out.println(ansH+" "+ansM);
	  }
	  }
}
