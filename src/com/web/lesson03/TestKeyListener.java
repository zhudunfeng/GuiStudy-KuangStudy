package com.web.lesson03;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * 键盘监听
 */
public class TestKeyListener {
    public static void main(String[] args) {
        new KeyFrame();
    }
}

class KeyFrame extends Frame {

    public KeyFrame() {
        setBounds(100, 100, 600, 500);
        setVisible(true);

        // 匿名内部类
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_UP) {
                    System.out.println("你点击了Up");
                }
            }
        });
    }
}
