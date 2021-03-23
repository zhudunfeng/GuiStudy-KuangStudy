package com.web.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

// 游戏中的面板
public class GamePanel extends JPanel implements KeyListener, ActionListener {

    // 定义蛇的数据结构
    int length; // 蛇的长度
    int[] snakeX = new int[600]; // 蛇的x坐标 25*25
    int[] snakeY = new int[600]; // 蛇的y坐标 25*25
    String direction; // 蛇头

    // 食物
    int foodX;
    int foodY;
    Random random = new Random();

    // 定义成绩
    int score;

    // 定义游戏状态
    boolean isStart = false; // 默认没开始
    // 定义游戏失败
    boolean isFail = false; // 默认不失败

    // 定时器 以ms为单位, 1000ms = 1s
    Timer timer = new Timer(100, this); // 100毫秒执行一次


    // 初始化方法
    public void init() {
        score = 0;

        length = 3;
        snakeX[0] = 100;
        snakeY[0] = 100; // 脑袋的坐标
        snakeX[1] = 75;
        snakeY[1] = 100;  // 第一个身体的坐标
        snakeX[2] = 50;
        snakeY[2] = 100;  // 第二个身体的坐标

        direction = "R"; //默认蛇头往右

        // 把食物随机分布在界面上
        foodX = 25 + 25 * random.nextInt(34);
        foodY = 75 + 25 * random.nextInt(24);

    }

    // 构造器
    public GamePanel() {
        init();
        // 获取焦点和键盘事件 缺这个按键盘没用
        this.setFocusable(true); // 获取焦点事件
        this.addKeyListener(this); // 获取键盘监听事件
        timer.start(); // 游戏一开始定时器就启动
    }


    // 绘制面板, 我们游戏中的所有东西, 都是用这只画笔
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);// 清屏
        // 绘制静态面板
        this.setBackground(Color.WHITE);
        Data.header.paintIcon(this, g, 25, 11); // 头部的广告栏画上去
        g.fillRect(25, 75, 850, 600); // 默认的游戏界面 默认是黑色

        // 画积分信息
        g.setColor(Color.WHITE);
        g.setFont(new Font("微软雅黑", Font.BOLD, 16));
        g.drawString("长度:" + length, 750, 35);
        g.drawString("得分:" + score, 750, 50);


        // 画食物
        Data.food.paintIcon(this, g, foodX, foodY);

        //绘制身体
        // 头
        switch (direction) {
            case "R":
                Data.right.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case "L":
                Data.left.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case "U":
                Data.up.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case "D":
                Data.down.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
        }
        // 身体
        for (int i = 1; i < length; i++) {
            Data.body.paintIcon(this, g, snakeX[i], snakeY[i]); // 画身体
        }


        // 游戏状态
        if (!isStart) { // !false  游戏还没开始, 显示: 提示如何开始
            g.setColor(Color.white);
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("按下空格开始游戏", 300, 300);
        }

        if (isFail) {
            g.setColor(Color.RED);
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("失败, 按下空格键重新开始", 200, 300);
        }

    }

    // 键盘监听事件
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode(); // 获取按下的是哪个按键

        switch (keyCode) {
            case KeyEvent.VK_SPACE:
                if (isFail) { // 如果失败了
                    // 重新开始
                    isFail = false;
                    init();
                } else {
                    isStart = !isStart; // 取反
                }
                repaint();  // 重新绘制, 必须加这一行, 因为值变化了, 必须重新绘制
                break;
            case KeyEvent.VK_UP:
                direction = "U";
                break;
            case KeyEvent.VK_DOWN:
                direction = "D";
                break;
            case KeyEvent.VK_LEFT:
                direction = "L";
                break;
            case KeyEvent.VK_RIGHT:
                direction = "R";
                break;
            default:
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


    // 事件监听  需要通过固定事件来刷新 1s:10次
    @Override
    public void actionPerformed(ActionEvent e) {
        if (isStart && !isFail) { // 游戏是开启状态, 让小蛇动起来
            // 吃食物
            if (snakeX[0] == foodX && snakeY[0] == foodY) {
                // 长度+1
                length++;
                // 得分
                score += 10;
                // 再生成一个新的食物坐标
                foodX = 25 + 25 * random.nextInt(34);
                foodY = 75 + 25 * random.nextInt(24);
            }


            // 身体的移动, 后一节移动到前一节的位置
            for (int i = length - 1; i > 0; i--) {
                snakeX[i] = snakeX[i - 1];
                snakeY[i] = snakeY[i - 1];
            }

            // 方向上的头变化
            // 碰到边界算失败
            switch (direction) {
                case "U":
                    snakeY[0] = snakeY[0] - 25;
                    if (snakeY[0] < 75) {
//                        snakeY[0] = 650;
                        isFail = !isFail;
                    }  // 边界判断
                    break;
                case "D":
                    snakeY[0] = snakeY[0] + 25;
                    if (snakeY[0] > 650) {
//                        snakeY[0] = 75;
                        isFail = !isFail;
                    }  // 边界判断
                    break;
                case "L":
                    snakeX[0] = snakeX[0] - 25;
                    if (snakeX[0] < 25) {
//                        snakeX[0] = 850;
                        isFail = !isFail;
                    }  // 边界判断
                    break;
                case "R":
                    snakeX[0] = snakeX[0] + 25;
                    if (snakeX[0] > 850) {
//                        snakeX[0] = 25;
                        isFail = !isFail;
                    }  // 边界判断
                    break;
                default:
            }

            // 失败判断, 碰到自己算失败
            for (int i = 1; i < length; i++) {
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                    isFail = true;
                    break;
                }
            }

            repaint(); // 重绘
        }
    }
}
