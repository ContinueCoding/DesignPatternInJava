package com.huoxy.c8_state_pattern_21.example2;

/**
 * 空闲状态的房间 - 只能预定和入住！
 */
public class FreeTimeRoomState implements RoomState {

    private Room room;

    public FreeTimeRoomState(Room room) {
        this.room = room;
    }

    @Override
    public void bookRoom() {
        System.out.println("您已经成功预定房间！");
        room.setBookedState(room.getBookedState());
    }

    @Override
    public void unsubscribeRoom() {
        //do nothing
    }

    @Override
    public void checkInRoom() {
        System.out.println("您已经成功入住！");
        room.setCheckInState(room.getCheckInState());
    }

    @Override
    public void checkOutRoom() {
        //do nothing
    }
}
