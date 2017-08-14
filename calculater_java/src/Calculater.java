/**
 * Created by nakazarika on 2017/08/14.
 */

import java.awt.*;
import java.awt.event.*;

public class Calculater extends Frame{
    Label lb1,lb2,lb3;
    TextField text1,text2;
    Button btn1;

    public static void main(String[] args) {
        new Calculater();
    }

    public Calculater(){
        this.setLayout(null);
        this.setSize(300,200);
        lb1 = new Label("金額");
        lb1.setBounds(25,50,25,18);
        this.add(lb1);
        text1 = new TextField();
        text1.setBounds(75,50,75,18);
        this.add(text1);
        lb2 = new Label("人数");
        lb2.setBounds(175,50,50,18);
        this.add(lb2);
        text2 = new TextField();
        text2.setBounds(225,50,25,18);
        this.add(text2);
        lb3 = new Label();
        lb3.setBounds(25,100,200,20);
        this.add(lb3);
        btn1 = new Button("計算");
        btn1.setBounds(125,150,50,20);
        btn1.addActionListener(new ActionClass());
        this.add(btn1);
        this.addWindowListener(new ExitClass());
        this.setVisible(true);
    }

    class ActionClass implements ActionListener {
        public void actionPerformed(ActionEvent ev){
            try {
                String s1 = text1.getText();
                String s2 = text2.getText();
                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);
                int ans = n1 / n2;
                String res = Integer.toString(ans);
                lb3.setText("１人当たり：" + res + "円");
            } catch(Exception ex){
                lb3.setText("【警告】数字を入力してください。");
            }
        }
    }

    class ExitClass extends WindowAdapter {
        public void windowClosing(WindowEvent ev){
            System.exit(0);
        }
    }
}