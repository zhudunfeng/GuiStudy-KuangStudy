package com.web.lesson05;

import javax.swing.*;
import java.awt.*;

/**
 * 复选框
 */
public class JButtonDemo3 extends JFrame{
    public void init() {
        Container container = getContentPane();

        setLayout(new FlowLayout());

        // 多选框
        JCheckBox checkBox1 = new JCheckBox("1");
        JCheckBox checkBox2 = new JCheckBox("2");
        JCheckBox checkBox3 = new JCheckBox("3");
        JCheckBox checkBox4 = new JCheckBox("4");

        container.add(checkBox1);
        container.add(checkBox2);
        container.add(checkBox3);
        container.add(checkBox4);

        setBounds(100, 100, 500, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JButtonDemo3().init();
    }
}
