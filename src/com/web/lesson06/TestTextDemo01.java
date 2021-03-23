package com.web.lesson06;

import javax.swing.*;
import java.awt.*;

public class TestTextDemo01 extends JFrame {
    public void init() {
        Container container = getContentPane();

        JTextField textField1 = new JTextField("hello");
        JTextField textField2 = new JTextField("world", 10);

        container.add(textField1, BorderLayout.NORTH);
        container.add(textField2, BorderLayout.SOUTH);

        setBounds(100, 100, 300, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestTextDemo01().init();
    }
}
