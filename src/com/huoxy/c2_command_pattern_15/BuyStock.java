package com.huoxy.c2_command_pattern_15;

public class BuyStock implements Order {
    private Stock appleStock;

    public BuyStock(Stock appleStock) {
        this.appleStock = appleStock;
    }

    @Override
    public void execute() {
        appleStock.buy();
    }
}
