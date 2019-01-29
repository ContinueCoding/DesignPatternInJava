package com.huoxy.c2_command_pattern_15;

public class SellStock implements Order {

    private Stock appleStock;

    public SellStock(Stock appleStock) {
        this.appleStock = appleStock;
    }

    @Override
    public void execute() {
        appleStock.sell();
    }
}
