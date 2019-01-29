package com.huoxy.c6_memento_pattern_19.example2;

/**
 *  实现场景：我们就以游戏挑战BOSS为实现场景，在挑战BOSS之前，角色的血量、蓝量都是满值，然后存档，
 *          在大战BOSS时，由于操作失误导致血量和蓝量大量损耗，所以只好恢复到刚刚开始的存档点，
 *          继续进行大战BOSS了。
 *
 *  Role角色的血量和蓝量通过CareTaker保存在Memento中！
 */
public class Role {
    private int bloodFlow;
    private int magicPoint;

    public Role(int bloodFlow, int magicPoint) {
        this.bloodFlow = bloodFlow;
        this.magicPoint = magicPoint;
    }

    public int getBloodFlow() {
        return bloodFlow;
    }

    public void setBloodFlow(int bloodFlow) {
        this.bloodFlow = bloodFlow;
    }

    public int getMagicPoint() {
        return magicPoint;
    }

    public void setMagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }

    /**
     * 保存当前血量和蓝量
     * @return 返回储存state的memento
     */
    public Memento saveMemento() {
        return new Memento(bloodFlow, magicPoint);
    }

    /**
     * 恢复之前的某个存档
     */
    public void restoreMemento(Memento memento) {
        this.bloodFlow = memento.getBloodFlow();
        this.magicPoint = memento.getMagicPoint();
    }

    /**
     * 显示当前用户的state
     */
    public void display() {
        System.out.println("当前用户状态：血量 = " + bloodFlow + ", 蓝量 = " + magicPoint);
    }

}
