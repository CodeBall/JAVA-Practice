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
                while(sc.hasNext()){
                    String str1 = sc.nextLine();
                    String str2 = sc.nextLine();
                    char[] s1 = str1.toCharArray();
                    char[] s2 = str2.toCharArray();
                    int i = 0,j = 0,flag = 0,l1 = str1.length(),l2 = str2.length();
                    if(l1 >= l1){
                        for(i = 0;i < l1;i++){
                            for(j = 0;j < l2;j++){
                                int t = 0;
                                if((i + j) >= l1)
                                    t = (i + j) % l1;
                                else
                                    t = i + j;
                                if(s1[t] == s2[j])continue;
                                else break;
                            }
                            if(j == l2){
                                flag = 1;
                                break;
                            }
                        }
                        if(flag == 1)
                            System.out.println("yes");
                        else
                            System.out.println("no");
                    }
                    else
                        System.out.println("no");
                }
	}
}
