/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.one;

/**
 *
 * @author xqq
 */
import java.util.Scanner;

public class PracticeOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   int n,m,g,s,b,a=0;
	   while(sc.hasNext())
	   {
		   m=sc.nextInt();
		   n=sc.nextInt();
		   a=0;
	   while(m<=n)
	   {
		   b=m/100;
		   s=(m-b*100)/10;
		   g=m%10;
		   if(m==b*b*b+s*s*s+g*g*g)
		   {
			   a++;
			   if(a==1)
			   {
				   System.out.printf("%d",m);
			   }
			   else
				   System.out.printf(" %d",m);
			  
		   }
		    m++;
	   }
	   if(a==0)
	   {
		   System.out.printf("no");
	   }
	   System.out.printf("\n");
	   
	   }
	}
}
