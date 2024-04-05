package com.web.lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 画笔
 */
public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}

// 画笔类
class MyPaint extends Frame {
    // 属性

    // 方法
    public void loadFrame() {
        setBounds(200, 200, 600, 500);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        //空圆
        g.setColor(Color.BLUE);
        g.drawOval(100, 100, 100, 100);

        //填充圆
        g.setColor(new Color(252, 229, 49));
        g.fillOval(100, 200, 200, 200);

        // 养成习惯, 画笔用完, 将他还原到最初的颜色
        g.setColor(Color.BLACK);
    }
}
