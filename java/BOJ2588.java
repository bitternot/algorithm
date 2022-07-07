/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		int i;
        
    int a = Integer.parseInt(A);
    char[] b = B.toCharArray();
        
	  int answer = 0;
	    
    for(i=B.length()-1; i>=0; i--)  {
      double j = Math.pow(10, 2-i);
      int intj = (int)Math.round(j);
      answer += a * (b[i] - '0') * intj;
      System.out.println(a * (b[i] - '0'));
    }
    
	  System.out.println(answer);
	}
}
