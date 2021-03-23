package com.web.snake;

import javax.swing.*;
import java.awt.*;

public class StartGame extends JFrame {

    public void init() {
        Container container = getContentPane();

        // 正常的游戏都应该在面板上
        container.add(new GamePanel());


        setBounds(10, 10, 900, 720);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // 启动游戏
    public static void main(String[] args) {
        // 启动游戏
        new StartGame().init();
    }

}
