package com.web.lesson06;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * 列表框
 */
public class TestComboxDemo02 extends JFrame {
    public void init() {
        Container container = getContentPane();

        // 生成列表的内容
        // 用 String[]
   /*     String[] list = {"1", "2", "3"};

        JList<String> jList = new JList<>(list);

        JPanel jPanel = new JPanel();

        jPanel.add(jList);
        container.add(jPanel);
*/

        // 用Vector
        Vector contents = new Vector();
        JList jList = new JList(contents);

        contents.add("1");
        contents.add("2");
        contents.add("3");

//        container.add(jList);
        JPanel panel = new JPanel();
        panel.add(jList);
        container.add(panel);

        setBounds(100, 100, 300, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestComboxDemo02().init();
    }
}
