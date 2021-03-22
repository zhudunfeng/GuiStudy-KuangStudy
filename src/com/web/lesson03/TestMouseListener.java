package com.web.lesson03;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

// 鼠标监听事件
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画笔");
    }
}

class MyFrame extends Frame {
    // 属性
    ArrayList points;

    // 方法
    public MyFrame(String title) {
        super(title);
        setSize(300, 200);
        // 存鼠标点击的点
        points = new ArrayList();

        setVisible(true);
        this.addMouseListener(new MyMouseListener());
    }

    // 鼠标监听
    @Override
    public void paint(Graphics g) {
        Iterator iterator = points.iterator();
        while (iterator.hasNext()) {
            Point point = (Point) iterator.next();
            g.setColor(Color.ORANGE);
            g.fillOval(point.x, point.y, 10, 10);
        }
    }

    // 添加一个点到界面上
    public void addPaint(Point point) {
        points.add(point);
    }

    // 获取鼠标点击位置的坐标  适配器模式
    private class MyMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame frame = (MyFrame) e.getSource();

            // 点击的时候, 界面产生一个点
            frame.addPaint(new Point(e.getX(), e.getY()));

            // 每次点击, 鼠标都需要重新画一遍
            frame.repaint();
        }
    }


}


