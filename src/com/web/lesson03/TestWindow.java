package com.web.lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {
    public static void main(String[] args) {
        new MyFrameTestWindow();
    }
}

class MyFrameTestWindow extends Frame {
    public MyFrameTestWindow() {
        setBackground(Color.blue);
        setBounds(100, 100, 600, 500);
        setVisible(true);

        this.addWindowListener(
            new WindowAdapter() {
                // 匿名内部类
                // 关闭窗口
                @Override
                public void windowClosing(WindowEvent e) {
                    System.out.println("windowClosing");
                    System.exit(0);
                }

                // 激活窗口 (未完成)
                @Override
                public void windowActivated(WindowEvent e) {
                    // MyFrameTestWindow 是本Frame名
                    MyFrameTestWindow source = (MyFrameTestWindow) e.getSource();
                    source.setTitle("被激活了");
                    System.out.println("windowActivated");
                }
            }
        );

    }

}

