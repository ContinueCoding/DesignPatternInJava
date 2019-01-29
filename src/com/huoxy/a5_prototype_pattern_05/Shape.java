package com.huoxy.a5_prototype_pattern_05;

//抽象Shape类
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    /**
     * 抽象方法 - 由子类实现！
     */
    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
