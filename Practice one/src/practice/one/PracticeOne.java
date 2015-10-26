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
    double[][] zb = new double[100][2];
    void fz(double x,double y,int i){
        zb[i][0] = x;
        zb[i][1] = y;
    }
    double num(int N,double R){
        double sum = 0,PI = 3.1415927;
        int i = 0;
        for(i=0;i< N-1;i++){
        double x=(zb[i][0]-zb[i+1][0])*(zb[i][0]-zb[i+1][0]);
        double y=(zb[i][1]-zb[i+1][1])*(zb[i][1]-zb[i+1][1]);
        sum+=Math.sqrt(x+y);
        }
        double x0=(zb[0][0]-zb[i][0])*(zb[0][0]-zb[i][0]);
        double y0=(zb[0][1]-zb[i][1])*(zb[0][1]-zb[i][1]);
        sum+=Math.sqrt(x0+y0)+2*PI*R;
        return sum;
    }
}
public class PracticeOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
                shulie sl;
                sl = new shulie();
                int n = sc.nextInt();
                double r = sc.nextDouble();
                for(int i = 0;i < n;i++){
                    double x = sc.nextDouble();
                    double y = sc.nextDouble();
                    sl.fz(x,y, i);
                }
                    double sum = sl.num(n, r);
                    System.out.printf("%.2f\n",sum);
	}
}
