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
                    int n = sc.nextInt();
                    char[] lei = new char[T];
                    for(int i = 0;i < T;i++){
                        lei[i] = sc.next().charAt(0);
                    }
                    
                    List[] lists = new List[T];
                    for(int i = 0;i < T;i++){
                        lists[i] = new ArrayList();
                    }
                    
                    for(int i = 0;i < n;i++){
                        String word = sc.next();
                        for(int j = 0;j < T;j++){
                            if(word.toUpperCase().charAt(0) == lei[j])
                                lists[j].add(word);
                        }
                    }
                    
                    for(int i = 0;i < T;i++){
                        int size = lists[i].size();
                        if(size > 0){
                            for(int j = 0;j < size;j++){
                                if(j >= 1){
                                    System.out.print(" ");
                                }
                                System.out.print(lists[i].get(j));
                            }
                            System.out.println();
                        }
                    }
                    System.out.println();
                }
	}
}
