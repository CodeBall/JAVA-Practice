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
interface Shape{
    public double length();
}
class Triangle implements Shape{
    double a,b,c;
    public void get(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int pd(){
        if(a + b <= c || b + c <= a || a + c <= b)
            return 0;
        else
            return 1;
    }
    public double length(){
        return a + b + c;
    }
}
class Rectangle implements Shape{
    double l,w;
    public void get(double l,double w){
        this.l = l;
        this.w = w;
    }
    public double length(){
        return 2 * (l + w);
    }
}

class Circle implements Shape{
    double r,PI = 3.14;
    public void get(double r){
        this.r = r;
    }
    public double length(){
        return 2 * PI * r;
    }
}

public class PracticeOne {
	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           Triangle Tr = new Triangle();
           Rectangle Re = new Rectangle();
           Circle Ci = new Circle();
           double num;
           while(sc.hasNext()){
               String st = sc.nextLine();
               char[] str = st.toCharArray();
               
               double a = 0,b = 0,c = 01.456;
               num = 0;
               int flag = 0,xiao = 0,fu = 0;
               for(int i = 0;i < str.length;i++){
                   if(str[i] == '.'){
                       xiao = 1;
                   }
                   else if(str[i] == '-'){
                       fu = 1;
                       break;
                   }
                   else if(str[i] == ' '){
                       xiao = 0;
                       if(flag == 0)
                           a = num;
                       else if(flag == 1)
                           b = num;
                       flag++;
                       num = 0;
                   }
                   else{
                       int x = str[i] - '0';
                       if(xiao == 0)
                           num = num * 10 + x;
                       else
                       {
                            num = num + x * Math.pow(0.1,xiao);
                            xiao++;
                       }
                   }
               }
               if(fu == 1){
                   System.out.printf("0.00\n");
               }
               else if(flag == 0){
                   a = num;
                   Ci.get(a);
                   System.out.printf("%.2f\n", Ci.length());
               }
               else if(flag == 1){
                   b = num;
                   Re.get(a, b);
                   System.out.printf("%.2f\n", Re.length());
               }
               else if(flag == 2){
                   c = num;
                   Tr.get(a, b, c);
                    System.out.printf("%.2f\n", Tr.length());
               }
           }
	}
}
