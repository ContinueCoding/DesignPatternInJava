package com.huoxy.c8_state_pattern_21.example2;

/**
 * 酒店客房类
 *  *支持预定、退订、入住、退房等操作！
 */
public class Room {
    //房间的3个状态（空闲、预定、入住）
    private RoomState freeTimeState;
    private RoomState bookedState;
    private RoomState checkInState;

    //当前的房间状态
    private RoomState currentState;

    public Room() {
        freeTimeState = new FreeTimeRoomState(this);
        bookedState = new BookedRoomState(this);
        checkInState = new CheckInRoomState(this);

        currentState = freeTimeState;
    }

    /**
     * 预定房间
     */
    public void bookRoom() {
        currentState.bookRoom();
    }

    /**
     * 退订房间
     */
    public void unsubscribeRoom() {
        currentState.unsubscribeRoom();
    }

    /**
     * 入住房间
     */
    public void checkInRoom() {
        currentState.checkInRoom();
    }

    /**
     * 退住房间
     */
    public void checkOutRoom() {
        currentState.checkOutRoom();
    }

    @Override
    public String toString() {
        return "该房间的当前状态是：" + currentState.getClass().toString();
    }

    //------getter\setter-------

    public RoomState getFreeTimeState() {
        return freeTimeState;
    }

    public void setFreeTimeState(RoomState freeTimeState) {
        this.freeTimeState = freeTimeState;
    }

    public RoomState getBookedState() {
        return bookedState;
    }

    public void setBookedState(RoomState bookedState) {
        this.bookedState = bookedState;
    }

    public RoomState getCheckInState() {
        return checkInState;
    }

    public void setCheckInState(RoomState checkInState) {
        this.checkInState = checkInState;
    }

    public RoomState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(RoomState currentState) {
        this.currentState = currentState;
    }
}
