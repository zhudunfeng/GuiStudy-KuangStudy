package com.web.lesson05;

import javax.swing.*;
import java.awt.*;

public class JButtonDemo2 extends JFrame{
    public void init() {
        Container container = getContentPane();

        // 单选框
        JRadioButton button1 = new JRadioButton("button1");
        JRadioButton button2 = new JRadioButton("button2");
        JRadioButton button3 = new JRadioButton("button3");

        // 单选框, 只能选1, 分组, 一个组只能选择1个
        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);

        container.add(button1, BorderLayout.NORTH);
        container.add(button2, BorderLayout.CENTER);
        container.add(button3, BorderLayout.SOUTH);


        setBounds(100, 100, 500, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JButtonDemo2().init();
    }
}
