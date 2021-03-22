package com.web.lesson03;

import java.awt.*;

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
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawOval(100, 100, 100, 100);
        g.setColor(new Color(252, 229, 49));
        g.fillOval(100, 200, 200, 200);

        // 养成习惯, 画笔用完, 将他还原到最初的颜色
        g.setColor(Color.BLACK);
    }
}