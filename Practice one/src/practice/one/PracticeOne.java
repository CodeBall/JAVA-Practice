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

 import java.util.Scanner;


class Cars{
    private int money;
    int getMoney(){
        return money;
    }
    protected void setMoney(int m){
        money = m;
    }
}
class keche extends Cars{
    int persons;
    keche(int p,int m){
        persons = p;
        setMoney(m);
    }
    int getPerson(){
        return persons;
    }
}
class pika extends Cars{
    private int persons;
    private double weight;
    pika(int p,double t,int m){
        persons = p;
        weight = t;
        super.setMoney(m);
    }
    int getPerson(){
        return persons;
    }
    double getWeight(){
        return weight;
    }
}
class huo extends Cars{
    private double weight;
    huo(double t,int m){
        weight = t;
        super.setMoney(m);
    }
    double getWeight(){
        return weight;
    }
}
public class PracticeOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                keche[] K = new keche[10];
                K[1] = new keche(5,800);
                K[2] = new keche(5,400);
                K[3] = new keche(5,800);
                K[4] = new keche(51,1300);
                K[5] = new keche(55,1500);
                pika[] P = new pika[10];
                P[6] = new pika(5,0.45,500);
                P[7] = new pika(5,2.0,450);
                huo[] H = new huo[11];
                H[8] = new huo(3,200);
                H[9] = new huo(25,1500);
                H[10] = new huo(35,2000);
		int t = sc.nextInt();
		if(t == 1){
                    int pe = 0,mon = 0;
                    double wei = 0.0;
                    int n = sc.nextInt();
                    for(int i = 0;i < n;i++){
                        int id = sc.nextInt();
                        int day = sc.nextInt();
                        if(id >= 1 && id <= 5){
                            pe += day * K[id].getPerson();
                            mon += day * K[id].getMoney();
                        }
                        else if(id >= 6 && id <= 7){
                            pe += day * P[id].getPerson();
                            wei += day * P[id].getWeight();
                            mon += day * P[id].getMoney();
                        }
                        else if(id >= 8 && id <= 10){
                            wei += day * H[id].getWeight();
                            mon += day * H[id].getMoney();
                        }
                    }
                    System.out.printf("%d ",pe);
                    if(wei == 0){
                        System.out.printf("0.00 ");
                    }
                    else
                        System.out.printf("%.2f ", wei);
                    System.out.printf("%d\n",mon);
                }
                else
                    System.out.println("0 0.00 0");
	}
}