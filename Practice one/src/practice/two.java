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
import java.text.DecimalFormat;

public class two {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                String xi = sc.nextLine();
                for(int j = 0;j < t;j++){
                    String ti = sc.nextLine();
                    char[] jiyou = ti.toCharArray();
                     if(ti.length()<5)
                    System.out.println(jiyou);
                     else{
                         for(int i = 4;i < ti.length();i++){
                              if(jiyou[i]=='y'&&jiyou[i-1]=='Z'&&jiyou[i-2]=='a'&&jiyou[i-3]=='r'&&jiyou[i-4]=='C')  
                              {jiyou[i-4]='c';jiyou[i-3]='R';jiyou[i-2]='A';jiyou[i-1]='z';jiyou[i]='Y';  }
                               if(jiyou[i]=='Y'&&jiyou[i-1]=='z'&&jiyou[i-2]=='a'&&jiyou[i-3]=='R'&&jiyou[i-4]=='c')  
                               {jiyou[i-4]='C';jiyou[i-3]='r';jiyou[i-2]='A';jiyou[i-1]='Z';jiyou[i]='y';  }
                         }
                         System.out.println(jiyou);
                     }
                }
	}
}
