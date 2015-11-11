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
                   String str = sc.nextLine();
                   char[] time = str.toCharArray();
                   int h = 0,m = 0,status = 0;
                   h=(time[0]-'0')*10+(time[1]-'0');  
                   m=(time[3]-'0')*10+(time[4]-'0');  
                   int a=h/10;  
                   int b=h%10;  
                   if(a+b*10>m && a+b*10<59)  
                        System.out.printf("%02d:%02d\n",h,a+b*10);  
                   else  
                    {  
                        if(h==23)  
                            System.out.printf("%02d:%02d\n",0,0);  
                        else  
                        {  
                            while(!(h+1<23 &&(h+1)%10*10+(h+1)/10<60))  
                            {  
                                h+=1;  
                            }  
                            System.out.printf("%02d:%02d\n",h+1,(h+1)%10*10+(h+1)/10);  
                        }  
                    }  
                }
	}
}
