package com.huoxy.d3_composite_entity_pattern;

/**
 * 创建粗粒度对象
 *
 */
public class CoarseGrainedObject {
    private DependentObject1 data1 = new DependentObject1();
    private DependentObject2 data2 = new DependentObject2();

    public CoarseGrainedObject() {
    }

    public void setData(String data1, String data2) {
        this.data1.setData(data1);
        this.data2.setData(data2);
    }

    public String[] getData(){
        return new String[]{data1.getData(), data2.getData()};
    }
}
