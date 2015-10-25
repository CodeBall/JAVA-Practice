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
        int y = 3,fn1 = 1,fn2 = 0;
        int fn0 = 0;
        for(y = 3;y <= n;y++){
            fn0 = 4 * fn1 - 5 * fn2;
            fn2 = fn1;
            fn1 = fn0;
        }
        return fn0;
    }
}
public class PracticeOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
                shulie sl;
                sl = new shulie();
                int N = sc.nextInt();
                while(N > 0){
                    int x = sc.nextInt();
                    System.out.println(sl.fn(x));
                    N--;
                }
	}
}
