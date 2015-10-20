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
import java.util.*;

public class PracticeOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int score[] =new int[n];
	   for(int i=0;i<n;i++)
	   {
		   int a=sc.nextInt();
		   int b=sc.nextInt();
		   int c=sc.nextInt();
		   score[i]=a+b+c;
	   }
	   Arrays.sort(score);
	  for(int i=n-1;i>=0;i--)
	  {
		  System.out.println(score[i]);
	  }
	}
}
