package com.web.lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * JDialog弹窗
 */
public class DialogDemo extends JFrame {
    public void init() {
        setTitle("程序");

        setSize(700, 500);

        // 容器, 放东西
        Container container = this.getContentPane();
        // 绝对布局
        container.setLayout(null);

        // 按钮
        JButton button = new JButton("点击出现弹窗");
        button.setBounds(30, 30, 200, 50);

        // 点击这个按钮的时候, 弹出一个弹窗
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 弹窗
                new MyDialogDemo();
            }
        });

        container.add(button);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DialogDemo().init();
    }
}

class MyDialogDemo extends JDialog {
    // 构造器
    public MyDialogDemo() {
        setTitle("hello");
        this.setBounds(100, 100, 500, 400);

        Container container = getContentPane();
//        container.setLayout(null);

        container.add(new JLabel("hello!",SwingConstants.CENTER));
        container.setBackground(Color.YELLOW);
        // defaultCloseOperation must be one of: DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, or DISPOSE_ON_CLOSE
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE); // 或者不写关闭这句话
        this.setVisible(true);
    }
}
