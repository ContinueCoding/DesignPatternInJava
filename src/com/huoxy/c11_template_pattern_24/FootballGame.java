package com.huoxy.c11_template_pattern_24;

public class FootballGame extends Game {

    @Override
    public void initialize() {
        System.out.println("准备足球游戏");
    }

    @Override
    public void startGame() {
        System.out.println("开始足球游戏");
    }

    @Override
    public void endGame() {
        System.out.println("结束足球游戏");
    }
}
