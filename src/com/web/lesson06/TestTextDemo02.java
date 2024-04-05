package com.web.lesson06;

import javax.swing.*;
import java.awt.*;

/**
 * 密码框
 */
public class TestTextDemo02 extends JFrame {
    public void init() {
        Container container = getContentPane();

        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setEchoChar('*');

        container.add(jPasswordField);

        setBounds(100, 100, 300, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestTextDemo02().init();
    }
}
