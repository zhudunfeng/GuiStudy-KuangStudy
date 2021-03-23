package com.web.lesson04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame {

    public void init() {
        // 获取图片的地址 图片命名不能是数字开头, 例如1.jpg是nullPointerException
        URL url = ImageIconDemo.class.getResource("tx.jpg");

        // 把一个图片变成图标, 放在label标签上
        ImageIcon icon = new ImageIcon(url);

        JLabel label = new JLabel("My ImageIcon");
        label.setIcon(icon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // 容器
        Container container = getContentPane();
        container.add(label);

        // 窗体的设置
        setBounds(100, 100, 600, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String[] args) {
        new ImageIconDemo().init();
    }
}
