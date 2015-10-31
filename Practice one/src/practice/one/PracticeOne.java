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

//import java.util.*;
// 
//public class PracticeOne {
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//           int t = sc.nextInt();
//           int[][] yanzhi = new int[t+1][3];
//           for(int i = 0;i < t;i++){
//               for (int j = 0;j < 2;j++){
//                   yanzhi[i][j] = sc.nextInt();
//               }
//           }
//           
//    }
//}
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class PracticeOne {
//    public static void main(String[] args) {
//        //注意，要想改变默认的排列顺序，不能使用基本类型（int,double, char）
//        //而要使用它们对应的类
//        Integer[] a = {9, 8, 7, 2, 3, 4, 1, 0, 6, 5};
//        //定义一个自定义类MyComparator的对象
//        Comparator cmp = new MyComparator();
//        Arrays.sort(a, cmp);
//        for(int i = 0; i < a.length; i ++) {
//            System.out.print(a[i] + " ");
//        }
//    }
//}
////Comparator是一个接口，所以这里我们自己定义的类MyComparator要implents该接口
////而不是extends Comparator
//class MyComparator implements Comparator<Integer>{
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        //如果n1小于n2，我们就返回正值，如果n1大于n2我们就返回负值，
//        //这样颠倒一下，就可以实现反向排序了
//        if(o1 < o2) { 
//            return -1;
//        }else if(o1 > o2) {
//            return 1;
//        }else {
//            return 0;
//        }
//    }
//    
//}

import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;  
import java.util.Scanner;
import java.io.*;
import java.lang.String;
import java.math.BigDecimal;
  
/** 
 * @function 给String型二维数组的一维排序 
 * @author ylchou@qq.com 
 * @date 2013-07-07 
 */  
class PracticeOne {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
           int t = sc.nextInt();
           String[][] arr = new String[t][2];
           for(int i = 0;i < t;i++){
               for (int j = 0;j < 2;j++){
                   arr[i][j] = sc.next();
               }
           }
        List<String> list = new ArrayList<String>();  
        //把二维数组转换为一维数组（一维元素含"\t"）,然后加入到list  
        for (int i = 0; i < arr.length; i++) {  
            StringBuffer line = new StringBuffer();  
            for (int j = 0; j < arr[i].length; j++) {  
                if(j<arr[i].length-1){  
                    line.append(arr[i][j]+"\t");  
                }else if(j==arr[i].length-1){  
                    line.append(arr[i][j]);  
                }  
            }  
            list.add(line.toString());   
        }  
        //排序  
        Collections.sort(list);  
        //把list转换为二维数组  
        for (int i = 0; i < list.size(); i++) {  
            String[] strSplit = list.get(i).toString().split("\t");  
            for (int j = 0; j <strSplit.length; j++) {  
                arr[i][j] = String.valueOf(strSplit[j]);  
            }  
        }  
        //加法计算
        int i = 0;
        for (i = 1; i < arr.length; i++) {  
            if(arr[i-1][0].compareTo(arr[i][0]) < 0)
                break; 
        }  
        if(i == 1)
           System.out.printf("%d %s\n",i,arr[0][1]);
        else{
            BigDecimal b1 = new BigDecimal(arr[0][1]);
            for(int j = 1;j < i;j++){
                BigDecimal b2 = new BigDecimal(arr[j][1]);
                b1 = b1.add(b2);
            }
            System.out.printf("%d %s\n",i,b1);
        }
        
    }  
}  