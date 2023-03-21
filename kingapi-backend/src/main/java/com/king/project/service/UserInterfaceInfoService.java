package com.king.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.king.project.model.entity.UserInterfaceInfo;

/**
* @author liangjingfeng
* @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Service
* @createDate 2023-03-16 15:43:49
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @return userId
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
