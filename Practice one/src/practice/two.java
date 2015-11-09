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
                for(int i = 0;i < t;i++){
                    String ti = sc.nextLine();
                    int year = 0,mouth = 0,daty = 0,hour = 0,minute = 0,second = 0;
                    int status = 0,pd = 0,flag = 0;
                    char[] time = ti.toCharArray();
                    for(int j = 0;j < ti.length();j++){
                        if(time[j] == '/' || time[j] == '-' || time[j] == ':'){
                            pd++;
                            if(pd == 1) year = status;
                            else if(pd == 2) mouth = status;
                            else if(pd == 3) daty = status;
                            else if(pd == 4){
                                hour = status;
                                if(hour == 0){
                                    hour = 12;
                                }
                                if(hour > 12){
                                    hour = hour - 12;
                                    flag = 1;
                                }
                            }
                            else if(pd == 5) minute = status;
                            status = 0;
                        }
                        else if(time[j] >= '0' && time[j] <= '9'){
                            status = status * 10 + (time[j] - '0');
                        }
                    }
                    second = status;
                    DecimalFormat df1=new DecimalFormat("00");
                    DecimalFormat df2=new DecimalFormat("0000");
                    String str=df1.format(mouth);
                    System.out.printf("%s/",str);
                    str = df1.format(daty);
                    System.out.printf("%s/",str);
                    str = df2.format(year);
                    System.out.printf("%s-",str);
                    str = df1.format(hour);
                    System.out.printf("%s:",str);
                    str = df1.format(minute);
                    System.out.printf("%s:",str);
                    str = df1.format(second);
                    if(flag == 0)
                    System.out.printf("%sam\n",str);
                    else
                        System.out.printf("%spm\n",str);
                }
	}
}
