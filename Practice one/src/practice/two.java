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
                while(sc.hasNext()){
                    int T = sc.nextInt();
                    List[] lists = new List[T];
                    for(int i = 0;i < T;i++){
                        lists[i] = new ArrayList();
                    }
                    for(int i = 0;i < T;i++){
                        String Name = sc.next();
                        String jue = sc.next();
                        if(jue.equals("woman") || jue.equals("child")){
                            lists[0].add(Name);
                        }
                        else if(jue.equals("man"))
                            lists[1].add(Name);
                        else if(jue.equals("captain"))
                            lists[2].add(Name);
                    }
                    for(int i = 0;i < T;i++){
                        for(int j = 0;j < lists[i].size();j++){
                            System.out.println(lists[i].get(j));
                        }
                    }
                }
	}
}
