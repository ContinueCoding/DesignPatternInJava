package com.huoxy.a4_builder_pattern_04;

import java.util.ArrayList;
import java.util.List;

//餐饭 - 某一个套餐
public class Meal {

    //套餐
    private List<Item> items = new ArrayList<>();

    /**
     * 添加餐饮项
     * @param item 食物or饮料
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 获取本套餐的价格
     * @return 价格
     */
    public float getPrice() {
        float totalPrice = 0;
        for(Item item : items) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    /**
     * 显示套餐的食物
     */
    public void showItems() {
        for (Item item : items) {
            System.out.println("Item: name = " + item.name()
                    + ", packing = " + item.packing().pack() + ", price = " + item.price());
        }
    }
}
