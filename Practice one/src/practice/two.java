/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author xqq
 */
import java.util.*;

public class two {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                int num = 0;
                while(sc.hasNext()){
                    String str = sc.nextLine();
                    String[] number = str.split("\\D+");
                    try{
                    int one = Integer.parseInt(number[0]);
                    int two = Integer.parseInt(number[1]);
                    int three = Integer.parseInt(number[2]);
                    
                    String[] chars = str.split("\\d+");
                    char ch = chars[1].charAt(0);
                    if(ch == '+'){
                        if(one + two == three)
                            num++;
                    }
                    else if(ch == '-'){
                        if(one - two == three)
                            num++;
                    }}
                    catch(Exception e){
                        
                    }
                }
                System.out.println(num);
	}
}
