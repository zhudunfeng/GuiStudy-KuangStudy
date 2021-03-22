package com.web.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 简易计算器
public class TestCalc2 {
    public static void main(String[] args) {
        new MyCalculator2().loadFrame();
    }
}

// 计算器类
class MyCalculator2 extends Frame {
    // 属性
    TextField num1, num2, num3;
    Label label;
    Button btnEqual;

    //方法
    public void loadFrame() {
        // 组件
        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(20);
        label = new Label("+");
        btnEqual = new Button("=");

        // 布局
        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(btnEqual);
        add(num3);

        // 设置"等号按钮"监听事件
        btnEqual.addActionListener(new MyCalculatorListen2(this));

        pack();
        setVisible(true);

    }
}

// 监听事件类
class MyCalculatorListen2 implements ActionListener {
    // 获取计算类对象
    MyCalculator2 calculator = null;

    MyCalculatorListen2(MyCalculator2 calculator) {
        this.calculator = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //1. 获取加数和被加数
        int n1 = Integer.parseInt(calculator.num1.getText());
        int n2 = Integer.parseInt(calculator.num2.getText());

        //2. 将这个值 + 运算之后, 放在第三个框中
        calculator.num3.setText(n1 + n2 + "");

        //3. 清除前两个框
        calculator.num1.setText("");
        calculator.num2.setText("");
    }
}