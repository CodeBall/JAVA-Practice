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
class shulie{
    int a1,b1,c1,a2,b2,c2;
    void fz(int a,int b,int c,int x,int y,int z){
        a1 = a;b1 = b;c1 = c;a2 = x;b2 = y;c2 = z;
    }
    int pd(){
        if(a1+b1<=c1||a1+c1<=b1||b1+c1<=a1){
        return 0;
        }
    else if(a2+b2<=c2||a2+c2<=b2||b2+c2<=a2){
        return 0;
        }
    else
        return 1;
    }
    int pdxs(){
        if(a1 * b2 == a2 * b1 && b1 * c2 == c1 * b2){
            return 1;
        }
        else if(a1 * c2 == a2 * b1 && b1 * b2 == c2 * c1){
            return 1;
        }
        else if(a1 * a2 == b2 * b1 && b1 * c2 == a2 * c1){
            return 1;
        }
        else if(a1 * c2 == b2 * b1 && b1 * a2 == c1 * c2){
            return 1;
        }
        else if(a1 * a2 == b1 * c2 && b1 * b2 == c1 * a2){
            return 1;
        }
        else if(a1 * b2 == c2 * b1 && b1 * c2 == b2 * c1){
            return 1;
        }
        else
            return 0;
    }
}
public class PracticeOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
                shulie sl;
                sl = new shulie();
                int a1,b1,c1,a2,b2,c2;
                while(sc.hasNext()){
                    a1 = sc.nextInt();
                    b1 = sc.nextInt();
                    c1 = sc.nextInt();
                    a2 = sc.nextInt();
                    b2 = sc.nextInt();
                    c2 = sc.nextInt();
                    sl.fz(a1, b1, c1, a2, b2, c2);
                    if(sl.pd() == 1){
                        if(sl.pdxs() == 1)
                            System.out.println("YES");
                        else
                            System.out.println("NO");
                    }
                    else{
                        System.out.println("NO");
                    }
                }
                
	}
}
