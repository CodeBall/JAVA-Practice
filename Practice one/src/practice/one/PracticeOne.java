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
class Rect{
    double l,h,z;
    public void set(double a,double b,double c){
        l = a;
        h = b;
        z = c;
    }
    public double length(){
        return 2 * (l + h);
    }
    public double area(){
        return l * h;
    }
}
class Cubic extends Rect{
    public double area(){
        return 2 * super.area() + 2 * h * z + 2 * l * z;
    }
    public double value(){
        return l * h * z;
    } 
}
class Pyramid extends Rect{
    public double area(){
        double s1 = l * Math.sqrt((1.0/4 * h * h + z * z));
       // System.out.printf("one = %f,two = %f\n",z,Math.sqrt((1/4 * h * h + z * z)));
        double s2 = h * Math.sqrt((1.0/4 * l * l + z * z));
        //System.out.printf("s1 = %f,s2 = %f\n",s1,s2);
        return s1 + s2 + super.area();
    }
    public double value(){
        return super.area() * z / 3.0;
    }
}
public class PracticeOne {
	public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);
            double l,h,z;
            Cubic cubic = new Cubic();
            Pyramid py = new Pyramid();
	    while(cin.hasNext()){
	    	l = cin.nextDouble();
                h = cin.nextDouble();
                z = cin.nextDouble();
                if(l <= 0 || h <= 0 || z <= 0)
                    System.out.printf("0.00 0.00 0.00 0.00\n");
                else{
                    cubic.set(l, h, z);
                    py.set(l, h, z);
                    System.out.printf("%.2f %.2f %.2f %.2f\n",cubic.area(),cubic.value(),py.area(),py.value());
                }
	    }
	}
}
