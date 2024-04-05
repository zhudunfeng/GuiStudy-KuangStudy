package com.web.lesson02;

import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Field;

/**
 * 测试文本域
 *
 * 输入框监听
 */
public class TestTextField {
    public static void main(String[] args) {
        // 启动
        new MyFrame();
    }
}

class MyFrame extends Frame {
    public MyFrame() {
        setSize(500, 500);

        TextField textField = new TextField(20);

        // 监听
        MyMonitor2 monitor = new MyMonitor2();
        // 回车, 就会触发事件
        textField.addActionListener(monitor);
        // 设置替换的编码
        textField.setEchoChar('*');

        add(textField);

        pack();
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyMonitor2 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField = (TextField) e.getSource();

        System.out.println(textField.getText());

        // 清空
        textField.setText("");
    }
}
