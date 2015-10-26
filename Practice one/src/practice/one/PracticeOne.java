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
    double[] dxs = new double[301];
    void qz(){
        double f = 1.0;
        for(int i = 2;i < 301;i++){
            if(i % 2 == 0)
                f = f - 1/(double)i;
            else
                f = f + 1/(double)i;
            dxs[i] = f;
        }
    }
    double fh(int n){
        return dxs[n];
    }
}
public class PracticeOne {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
                shulie sl;
                sl = new shulie();
                sl.qz();
                while(sc.hasNext()){
                    int n = sc.nextInt();
                    double num;
                    if(n == 1)
                        num = 1.00;
                    else if(n == 0)
                        num = 0;
                    else if(n > 300)
                    {
                        num = 0.69;
                    }
                    else
                        num = sl.fh(n);
                    System.out.printf("%.2f\n",num);
                }
	}
}
