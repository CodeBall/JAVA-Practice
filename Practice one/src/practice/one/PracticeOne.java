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
class people{
	private int x;
	private int  y;
	people(){
		this.x = 0;
		this.y = 0;
	}
	people(int x,int y){
		this.x = x;
		this.y = y;
	}
	public void printf(){
		System.out.println("("+this.x+","+this.y+")");
	}
	
}
public class PracticeOne {
	public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);
	    while(cin.hasNext()){
	    	people p = new people(cin.nextInt(),cin.nextInt());
	    	System.out.println("(0,0)");
	    	p.printf();
	    }
	}
}
