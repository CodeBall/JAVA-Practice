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

public class two {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                while(sc.hasNext()){
                   String ss = sc.nextLine();
                   String s = " ";
                   String[] arr = ss.split("\\s+");
                   String S = arr[0];
                   String T = arr[1];
                   char[] str1 = S.toCharArray();
                   char[] str = T.toCharArray();
                   int l = T.length();
                   int p = S.length();
                   int m = 0;
                   for(int h = 0;h < l;h++){
                       if(str1[m] == str[h])  
                       {  
                            m++;  
                            if(m == p)  
                            {  
                                System.out.printf("Yes\n");  
                                break;  
                            }  
                        }  
                   }
                   if(m < p){
                       System.out.printf("No\n");  
                   }
                }
	}
}
