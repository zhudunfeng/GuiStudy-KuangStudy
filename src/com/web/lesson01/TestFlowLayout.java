package com.web.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 流式布局
 */
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("FlowLayout");

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

//        frame.setLayout(new FlowLayout());
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        Button btn1 = new Button("button1");
        Button btn2 = new Button("button2");
        Button btn3 = new Button("button3");

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
