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
class Complex{
    int real,image;
    public Complex(int s,int x){
        real = s;
        image = x;
    }
    public void add(int s,int x){
        real += s;
        image += x;
    }
    public void sub(int s,int x){
        real -= s;
        image -= x;
    }
    public void cheng(int s,int x){
        int f = image * s + real * x;
        real = real * s - image * x;
        image = f;
    }
    public void show(){
        if(real == 0 && image == 0)
            System.out.println("0");
        else if(real == 0)
            System.out.println(""+image + "i");
        else if(image == 0)
            System.out.println(""+real);
        else if(image < 0)
            System.out.println(""+real + image + "i");
        else
            System.out.println(""+real + "+" + image + "i");
    }
}
public class PracticeOne {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
                int x = sc.nextInt();
                int y = sc.nextInt();
               Complex complex = new Complex(x,y);
               while(sc.hasNext()){
                   x = sc.nextInt();
                   y = sc.nextInt();
                   int z = sc.nextInt();
                   if(z == 1)
                       complex.add(x, y);
                   else if(z == 2)
                       complex.sub(x, y);
                   else if(z == 3)
                       complex.cheng(x, y);
                   complex.show();
               }
               complex.show();
	}
}
