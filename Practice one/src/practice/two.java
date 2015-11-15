/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author xqq
 */
import java.util.Scanner;
import java.math.*;
import java.text.*;

public class two {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
               int T = sc.nextInt();
               BigInteger a,b;
               for(int i = 1;i <= T;i++){
                   a = sc.nextBigInteger();
                   b = sc.nextBigInteger();
                   System.out.println("Case " + i + ":\n" + a + " + " + b + " = " + a.add(b));
                   if(i < T)
                       System.out.println();
               }
	}
}
