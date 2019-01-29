package com.huoxy.c8_state_pattern_21.example2;

/**
 * 已入住的房间 - 只能退房
 */
public class CheckInRoomState implements RoomState {

    private Room room;

    public CheckInRoomState(Room room) {
        this.room = room;
    }

    @Override
    public void bookRoom() {
        System.out.println("已入住，不能预定");
    }

    @Override
    public void unsubscribeRoom() {
        System.out.println("已入住，不能退订");
    }

    @Override
    public void checkInRoom() {
        System.out.println("已入住");
    }

    @Override
    public void checkOutRoom() {
        System.out.println("退房成功");
        room.setFreeTimeState(room.getFreeTimeState());
    }
}
