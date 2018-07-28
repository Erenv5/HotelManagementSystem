package com.hotel.hotel.service;


import com.hotel.hotel.domain.RoomOrderInfo;

public interface RoomOrderInfoService {
    //手机号查看用户是否已预订过房间
    boolean telNoOrdered(String tel);

    //根据预定 ID 获取预订信息
    RoomOrderInfo getInfoById(Long id);

    //根据手机号查询预定信息
    RoomOrderInfo getInfoByTel(String tel);
}