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
import java.util.Scanner;
import java.math.*;
import java.text.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class two {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                while(sc.hasNext()){
                    int t = sc.nextInt();
                    List<Integer> list = new ArrayList<Integer>();
                    for(int i = 0;i < t;i++){
                        int in = sc.nextInt();
                        list.add(in);
                    }
                    List<Integer> listTemp = new ArrayList<Integer>();
                    Iterator<Integer> it=list.iterator();
                    while(it.hasNext()){
                        int a = it.next();
                        if(listTemp.contains(a)){
                            it.remove();
                        }
                        else{
                            listTemp.add(a);
                        }
                    }
                    Collections.sort(list);
                    int len = list.size(),len1 = 0;
                    for(Integer i:list){
                        len1++;
                        if(len1 < len)
                        System.out.printf("%d ",i);
                        else
                            System.out.println(i);
                    }
                }
	}
}

