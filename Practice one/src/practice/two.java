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
import java.io.*;
import javax.swing.*;

public class two {
    public static void main(String[] args) {
		File file = null;
                //定义字节数组，存放在文件中读取的数据
                char[] date = new char[20];
		JFileChooser fc = new JFileChooser("E:\\Project\\JAVA-Practice"); // 创建一个文件选择器
		
		//打开文件，获得选择的文件名称
		fc.setDialogTitle("open"); // 设置标题
                if (fc.showOpenDialog(new JFrame()) == JFileChooser.APPROVE_OPTION) {// 如果选择了确定按钮，就获得选择的文件对象
			file = fc.getSelectedFile();   //file存放选取的文件对象
		}
                //获取到文件的绝对路径并打印出来
                String filePath = file.getAbsolutePath();
                System.out.println(filePath);
                //获取到文件的长度
                long lenFile = file.length();

                System.out.println("查看该文件是否是一个普通文件：" + file.isFile());
                System.out.println("查看该文件的名字：" + file.getName());
                System.out.println("获取文件最后修改的时间：" + file.lastModified());
                //创建输入流,因为使用获取到的文件对象，所以不存在文件没有的情况，但是为了保险起见，还是要处理异常
                try{
                    FileReader in = new FileReader(file);

                //读取文件内容并保存到数组中
                    while(in.read(date) != -1){
                        String s = new String(date);
                        System.out.println(s);
                        }
                    //关闭输入流
                    in.close();
                    }
                catch(IOException e){
                    System.out.println("File read Error" + e);
                }
                //对读取的文件内容进行操作
                //将char型数组转换成String
                String shuju = String.valueOf(date);
                //将小写转换成大写
                shuju = shuju.toUpperCase();
                System.out.println(shuju);
                
                //保存文件
		fc.setDialogTitle("save");
		if (fc.showSaveDialog(new JFrame()) == JFileChooser.APPROVE_OPTION) {// 如果选择了确定按钮，就获得选择的文件对象
			file = fc.getSelectedFile();   //file存放选取的文件对象
		}
                date = shuju.toCharArray();
                try{
                FileWriter out = new FileWriter(file,true);
                out.write(date,0,date.length);
                out.close();
                }
                catch(IOException e){
                    System.out.println(e.toString());
                }
	}
}
