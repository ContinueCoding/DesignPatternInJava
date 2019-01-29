package com.huoxy.c8_state_pattern_21.example2;

//酒店房间的不同action
public interface RoomState {

    //预定
    void bookRoom();

    //退订
    void unsubscribeRoom();

    //入住
    void checkInRoom();

    //退房
    void checkOutRoom();
}
