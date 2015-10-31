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
  

class PracticeOne {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
          while(sc.hasNext()){
              String str = sc.nextLine();
              if(str.compareTo("red") == 0)
                  System.out.println("Rose are red.");
              else if(str.compareTo("orange") == 0)
                  System.out.println("Poppies are orange.");
               else if(str.compareTo("yellow") == 0)
                  System.out.println("Sunflower are yellow.");
               else if(str.compareTo("green") == 0)
                  System.out.println("Grass are green.");
               else if(str.compareTo("blue") == 0)
                  System.out.println("Bluebells are blue.");
               else if(str.compareTo("violet") == 0)
                  System.out.println("Violets are violet.");
               else
                  System.out.println("I don't know about the color " + str + ".");
          }
        
    }  
}  