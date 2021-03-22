package com.web.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 简易计算器
public class TestCalc {
    public static void main(String[] args) {
        new MyCalculator();
    }
}
// 计算器类
class MyCalculator extends Frame {

    public MyCalculator() {
        // 组件
        TextField num1 = new TextField(10);
        TextField num2 = new TextField(10);
        TextField num3 = new TextField(20);

        Label label = new Label("+");
        Button btnEqual = new Button("=");

        // 布局
        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(btnEqual);
        add(num3);

        // 设置"等号按钮"监听事件
        btnEqual.addActionListener(new MyCalculatorListen(num1, num2, num3));

        pack();
        setVisible(true);
    }
}

// 监听事件类
class MyCalculatorListen implements ActionListener {
    // 获取3个变量
    TextField num1, num2, num3;

    MyCalculatorListen(TextField num1, TextField num2, TextField num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //1. 获取加数和被加数
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());

        int n3 = n1 + n2;

        //2. 将这个值 + 运算之后, 放在第三个框中
        num3.setText("" + n3);

        //3. 清除前两个框
        num1.setText("");
        num2.setText("");
    }
}