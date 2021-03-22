package com.web.lesson01;

import java.awt.*;

public class TestFrame2 {

    public static void main(String[] args) {
        MyFrame myFrame1 = new MyFrame(100, 100, 200, 200, Color.orange);
        MyFrame myFrame2 = new MyFrame(300, 100, 200, 200, Color.red);
        MyFrame myFrame3 = new MyFrame(100, 300, 200, 200, Color.yellow);
        MyFrame myFrame4 = new MyFrame(300, 300, 200, 200, Color.blue);
    }
    // setBound = setSize + setLocation
}

class MyFrame extends Frame {
    public MyFrame(int x, int y, int w, int h, Color color) {
        int i = 0;

        setTitle("我的第" + (++i) + "个窗口");
        setBounds(x, y, w, h);
        setBackground(color);
        setResizable(false);
        setVisible(true);

    }
}
