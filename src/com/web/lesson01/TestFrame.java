package com.web.lesson01;

import java.awt.*;

/**
 * 框架(主窗口)
 */
public class TestFrame {
    public static void main(String[] args) {
        // Frame
        Frame frame = new Frame("我的第一个Java图形界面窗口");

        // 设置窗口的大小
        frame.setSize(300, 200);

        // 设置背景颜色 Color
        frame.setBackground(new Color(158, 152, 252));

        // 窗口弹出的初始位置
        frame.setLocation(200, 200);

        // 窗口不可改变大小
        frame.setResizable(false);

        // 设置窗口的可见性
        frame.setVisible(true);
    }
}
