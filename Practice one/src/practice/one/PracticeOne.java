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
    int[] xi = new int[16];
    int[] yi = new int[16];
    void shuli(int x,int y,int i){
        xi[i] = x;
        yi[i] = y;
    }
    int hxy(int n){
        int chengji = 0;
        for(int i = 0;i < n;i++){
            chengji += xi[i] * yi[i];
        }
        return chengji;
    }
    int hx(int n){
        int hex = 0;
        for(int i = 0;i < n;i++)
            hex += xi[i];
        return hex;
    }
    int hy(int n){
        int hey = 0;
        for(int i = 0;i < n;i++)
            hey += yi[i];
        return hey;
    }
    int hx2(int n){
        int hex2 = 0;
        for(int i = 0;i < n;i++)
            hex2 = xi[i] * xi[i] + hex2;
        return hex2;
    }
}
public class PracticeOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
                shulie sl;
                sl = new shulie();
                int n = sc.nextInt();
                for(int i = 0;i < n;i++){
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    sl.shuli(x,y,i);
                }
                int hxy = sl.hxy(n);
                int hx = sl.hx(n);
                int hy = sl.hy(n);
                int hx2 = sl.hx2(n);
                int fza = n * hxy - hx * hy;
                int fm = n * hx2 - hx * hx;
                int fzb = hy * hx2 - hx * hxy;
                double a = (double)fza / (double)fm;
                double b = (double)fzb / (double)fm;
                System.out.printf("%.3f\n",a);
                System.out.printf("%.3f\n",b);
	}
}
