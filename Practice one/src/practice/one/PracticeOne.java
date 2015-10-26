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
class Time{
    private int hour,minute,second;
    public void setHour(int n){
        if(n > 12 || n < 0)
            n = 12;
        hour = n;
    }
    public void setMinute(int n){
        if(n > 60 || n < 0)
            n = 0;
        minute = n;
    }
    public void setSecond(int n){
        if(n > 60 || n < 0)
            n = 0;
        second = n;
    }
    public void setTime(int x,int y,int z){
        if(x > 12 || x < 0)
            x = 12;
        if(y > 60 || y < 0)
            y = 0;
        if(z > 60 || z < 0)
            z = 0;
        hour = x;
        minute = y;
        second = z;
    }
    public void showTime(){
        System.out.printf("%02d:%02d:%02d\n",hour,minute,second);
    }
}
public class PracticeOne {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
                Time time = new Time();
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                time.setTime(x, y, z);
                time.showTime();
	}
}
