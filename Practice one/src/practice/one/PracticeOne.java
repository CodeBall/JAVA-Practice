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
import java.math.*;
class shulie{
   int c,k,z,m;
   void Rect(int length){
       if(length < 0)
           length = 0;
       c = length;
       k = length;
       z = 4 * length;
       m = length * length;
   }
   void Rect(int length,int width){
       if(width < 0)
           width = 0;
       if(length < 0)
           length = 0;
       c = length;
       k = width;
       z = 2 * (length + width);
       m = length * width;
   }
}
public class PracticeOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
                shulie sl;
                sl = new shulie();
                String st;
               while(sc.hasNext()){
                   st = sc.nextLine();
                   char[] str = st.toCharArray();
                   int flag = 0,num = 0,a = 0,length = 0,width = 0;
                   for(int i = 0;i < str.length;i++){
                       if(str[i] == '-'){
                           flag = 1;
                       }
                       else if(str[i] == ' '){
                           if(flag == 1)
                               length = 0;
                           else
                               length = num;
                           flag = 2;
                           num = 0;
                       }
                       else{
                           a = str[i] - '0';
                           num = num * 10 + a;
                       }
                   }
                   if(flag == 0)
                       length = num;
                   if(flag == 2){
                       width = num;
                   }
                   if(width == 0)
                   sl.Rect(length);
                   else
                       sl.Rect(length, width);
                   System.out.println(sl.c + " " +sl.k + " " + sl.z + " " + sl.m);
               }
	}
}
