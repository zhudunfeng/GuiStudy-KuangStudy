package com.web.lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo extends JFrame {

    public void init() {
        Container container = getContentPane();

        URL url = JButtonDemo.class.getResource("tx.jpg");
        // 将图片变成图标
        ImageIcon imageIcon = new ImageIcon(url);

        // 把这个图标放进button里
        JButton jButton = new JButton(imageIcon);
        jButton.setToolTipText("图片按钮");

        container.add(jButton);

        setBounds(100, 100, 500, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JButtonDemo().init();
    }
}
