package com.web.lesson05;

import javax.swing.*;
import java.awt.*;

public class JScrollDemo extends JFrame {
    public void init() {
        Container container = getContentPane();

        // 文本域
        JTextArea textArea = new JTextArea(10, 10);
        textArea.setText("hellooooooooooooooooooooooooooooooooooooooo");

        // ScrollPanel 滚动面板
        JScrollPane jScrollPane = new JScrollPane(textArea);
        container.add(jScrollPane);

        setBounds(100, 100, 100, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JScrollDemo().init();
    }
}
