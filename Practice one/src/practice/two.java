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
               for(int i = 0;i < T;i++){
                   String str = sc.next();
                   String newStr = temp(str);
                   System.out.println(newStr);
               }
	}
    public static String temp(String oldStr){
        StringBuffer buffer = new StringBuffer();
        char[] str = oldStr.toCharArray();
        for(int i = 0;i < oldStr.length();i++){
            buffer.append(str[i]);
            if(str[i] == '-' && i > 0 && i < oldStr.length() - 1){
                char st = str[i-1];
                char ed = str[i+1];
                if(st <= ed && ((st >= 'a' && ed <= 'z') || (st >= 'A' && ed <= 'Z') || (st >= '0' && ed <= '9'))){
                    buffer.deleteCharAt(buffer.length() - 1);
                    for(int j = st + 1;j <= ed - 1;j++){
                        buffer.append((char) j);
                    }
                }
            }
        }
        return buffer.toString();
    }
}
