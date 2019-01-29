package com.huoxy.c11_template_pattern_24;

//篮球游戏
public class BasketBallGame extends Game {

    @Override
    public void initialize() {
        System.out.println("准备篮球游戏...");
    }

    @Override
    public void startGame() {
        System.out.println("开始篮球游戏...");
    }

    @Override
    public void endGame() {
        System.out.println("结束篮球游戏...");
    }
}
