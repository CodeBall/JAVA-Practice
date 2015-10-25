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

    int fn(int n){
        int fn0 = 1;
        for(int y = 1;y <= n;y++){
            fn0 *= y;
        }
        return fn0;
    }
}
public class PracticeOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
                shulie sl;
                sl = new shulie();
                while(sc.hasNext()){
                    int n = sc.nextInt();
                    int m = sc.nextInt();
                    int nj = sl.fn(n);
                    int mj = sl.fn(m);
                    int nmj = sl.fn(n-m);
                    int fm = mj * nmj;
                    int zu = nj / fm;
                    System.out.println(zu);
                }
	}
}
