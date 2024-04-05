package com.web.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 网格布局
 */
public class TestGridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("GirdLayout");
        frame.setLayout(new GridLayout(3, 2));

        Button btn1 = new Button("button1");
        Button btn2 = new Button("button2");
        Button btn3 = new Button("button3");
        Button btn4 = new Button("button4");
        Button btn5 = new Button("button5");
        Button btn6 = new Button("button6");
        //9个, 即使设置了3行2列, 依然是3行3列
/*        Button btn7 = new Button("button7");
        Button btn8 = new Button("button8");
        Button btn9 = new Button("button9");*/

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
/*        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);*/

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
        frame.pack();
    }
}
