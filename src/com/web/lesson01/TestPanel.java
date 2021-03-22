package com.web.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();

        // 设置布局
        frame.setLayout(null);

        // frame设置坐标
        frame.setBounds(300, 300, 500, 500);
        frame.setBackground(new Color(116, 161, 217));

        // panel设置坐标, 相对于frame
        panel.setBounds(50, 70, 100, 100);
        panel.setBackground(Color.white);

        frame.add(panel);

        frame.setVisible(true);

        // 监听事件, 监听关闭窗口 适配器模式:WindowAdapter
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
