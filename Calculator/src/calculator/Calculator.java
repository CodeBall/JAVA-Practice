/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.JFrame;
/**
 * @author xqq
 */
public class Calculator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //System.out.println("Hello World");
        //类对象的声明和初始化
        NewJFrame frm1 = new NewJFrame();
        //下面这个方法负责根据参数的值显示和隐藏窗体，
        frm1.setTitle("我的计算器");
        //设置默认点击关闭按钮时触发的操作，在JFrame中定义
        frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLocationRelativeTo设置窗体相对于组件参数的位置，如果为null，则至于屏幕中央
        frm1.setLocationRelativeTo(null);
        frm1.setVisible(true);
    }
    
}
