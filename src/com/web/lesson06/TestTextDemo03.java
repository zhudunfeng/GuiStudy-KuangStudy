package com.web.lesson06;

import javax.swing.*;
import java.awt.*;

public class TestTextDemo03 extends JFrame {
    public void init() {
        Container container = getContentPane();

        JTextArea jTextArea = new JTextArea(20, 10);
        jTextArea.setText("haha");

        JScrollPane scrollPane = new JScrollPane(jTextArea);
        container.add(scrollPane);

        setBounds(100, 100, 300, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestTextDemo03().init();
    }
}
