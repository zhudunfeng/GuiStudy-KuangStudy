package com.web.lesson04;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo extends JFrame{
    // init() 初始化
    public void init() {
        setTitle("JFrame窗口");
        setBounds(100, 100, 300, 200);
//        jf.setBackground(Color.BLUE); // 这个颜色设置不成功, JFrame是顶级窗口, 颜色设置要放在容器里才能生效噢

        // 设置文字
        JLabel label = new JLabel( "hello");
        add(label);

        // 让文字居中
        // horizontal 水平
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // 获得容器 , 设置背景颜色
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.YELLOW);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        // 建立一个窗口
        new JFrameDemo().init();
    }
}
