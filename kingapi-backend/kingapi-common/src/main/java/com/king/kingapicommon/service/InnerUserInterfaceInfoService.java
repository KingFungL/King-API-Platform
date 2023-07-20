package com.king.kingapicommon.service;

import com.king.kingapicommon.model.entity.UserInterfaceInfo;

/**
 * @author King
 * @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
 *
 */
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

    /**
     * 调用接口剩余次数
     * 小于等于0次就返回false，大于0返回true
     * @param interfaceInfoId
     * @Param userId
     * @return
     */
    boolean invokeLeftNum(long interfaceInfoId, long userId);

    /**
     * 添加默认的用户接口信息
     *
     * @param interfaceId 接口id
     * @param userId      用户id
     * @return Boolean 是否添加成功
     */
    Boolean addDefaultUserInterfaceInfo(Long interfaceId, Long userId);

    /**
     * 检查用户是否有接口
     *
     * @param interfaceId 接口id
     * @param userId     用户id
     * @return UserInterfaceInfo 用户接口信息
     */
    UserInterfaceInfo checkUserHasInterface(long interfaceId, long userId);

}
