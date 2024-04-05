package com.web.lesson06;

import javax.swing.*;
import java.awt.*;

/**
 * 下拉框
 */
public class TestComboxDemo01 extends JFrame {
    public void init() {
        Container container = getContentPane();

        JComboBox status = new JComboBox();

        JPanel jPanel = new JPanel();

        status.addItem(null);
        status.addItem("正在热映");
        status.addItem("已下架");
        status.addItem("即将上映");

        jPanel.add(status);
        container.add(jPanel);

        setBounds(100, 100, 300, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestComboxDemo01().init();
    }
}
