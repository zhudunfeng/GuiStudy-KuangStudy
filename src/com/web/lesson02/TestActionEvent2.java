package com.web.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 两个按钮监听同一个事件
public class TestActionEvent2 {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Button btnStart = new Button("start");
        Button btnEnd = new Button("end");

        btnEnd.setActionCommand("the btnEnd is clicked");

        MyMonitor myMonitor = new MyMonitor();
        btnStart.addActionListener(myMonitor);
        btnEnd.addActionListener(myMonitor);

        frame.add(btnStart, BorderLayout.NORTH);
        frame.add(btnEnd, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}

class MyMonitor implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        // 输出信息
        // 默认是label内容
        System.out.println("被点击信息: " + e.getActionCommand());
    }
}