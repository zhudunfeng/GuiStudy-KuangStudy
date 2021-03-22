package com.web.lesson04;

import javax.swing.*;
import java.awt.*;

// 图标, 需要实现类, Frame继承
public class IconDemo extends JFrame implements Icon {
    private int width;
    private int height;

    public IconDemo() {} // 无参构造

    public IconDemo (int width, int height) { // 有参构造
        this.width = width;
        this.height = height;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x, y, width, height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }

    // init 窗体
    public void init() {
        // 窗体设置大小
        setTitle("IconDemo");
        setBounds(100, 100, 300, 200);

        IconDemo iconDemo = new IconDemo(15, 15);
        // 图标可以放在标签上, 也可以放在按钮上
        JLabel label =new JLabel("图标", iconDemo, SwingConstants.CENTER);  // SwingConstants.RIGHT整体右对齐

        Container container = getContentPane();
        container.add(label);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new IconDemo().init();
    }
}
