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

class juxing{
    int x1,y1,x2,y2;
    public juxing(int a,int b,int c,int d){
        x1 = a;
        x2 = c;
        y1 = b;
        y2 = d;
    }
    public int pd(int x,int y){
        if(x > x1 && x < x2){
            if(y > y1 && y < y2)
                return 1;
            else
                return 0;
        }
        else
            return 0;
    }
}
  class PracticeOne {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
         while(sc.hasNext()){
             int t = sc.nextInt();
             int num = 0;
             juxing point = new juxing(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
             for(int i = 0;i < t;i++){
                 int x = sc.nextInt();
                 int y = sc.nextInt();
                 if(point.pd(x, y) == 1)
                     num++;
             }
             System.out.println(num);
         }
    }  
}  

