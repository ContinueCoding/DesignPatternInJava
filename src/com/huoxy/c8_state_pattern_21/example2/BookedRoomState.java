package com.huoxy.c8_state_pattern_21.example2;

/**
 * 已经预定的房间 - 只能退订、入住
 */
public class BookedRoomState implements RoomState {

    private Room room;

    public BookedRoomState(Room room) {
        this.room = room;
    }

    @Override
    public void bookRoom() {
        System.out.println("已经被预定");
    }

    @Override
    public void unsubscribeRoom() {
        System.out.println("退订成功");
        room.setFreeTimeState(room.getFreeTimeState());
    }

    @Override
    public void checkInRoom() {
        System.out.println("入住成功");
        room.setCheckInState(room.getCheckInState());
    }

    @Override
    public void checkOutRoom() {
        //do nothing
    }
}
