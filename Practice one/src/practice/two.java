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
                   int[] hour = {0,1,2,3,4,5,10,11,12,13,14,15,20,21,22,23,24};
                   int[] minute = {0,10,20,30,40,50,1,11,21,31,41,51,2,12,22,32,60};
                   String str = sc.nextLine();
                   char[] time = str.toCharArray();
                   int h = 0,m = 0,status = 0;
                   for(int i = 0;i < str.length();i++){
                       if(time[i] == ':'){
                           h = status;
                           status = 0;
                       }
                       else if(time[i] >= '0' && time[i] <= '9'){
                           status = status * 10 + (time[i] - '0');
                       }
                   }
                   m = status;
                   int i = 0;
                   DecimalFormat df1=new DecimalFormat("00");
                   if(h == 23 && m >= 32)
                       System.out.println("00:00");
                   else{
                       String ans1 = null;String ans2 = null;
                        for(i = 0;i < 16;i++){
                            if(hour[i] >= h && h < hour[i+1]){
                                if(m < minute[i]){
                                    ans1 = df1.format(hour[i]);
                                    ans2 = df1.format(minute[i]);
                                }
                                else{
                                    ans1 = df1.format(hour[i+1]);
                                    ans2 = df1.format(minute[i+1]);
                                }
                                break;
                            }
                        }
                        System.out.println(ans1 + ":" + ans2);
                   }
                }
	}
}
