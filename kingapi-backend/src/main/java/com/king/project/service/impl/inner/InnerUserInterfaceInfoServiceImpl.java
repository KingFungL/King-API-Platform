package com.king.project.service.impl.inner;

import com.king.kingapicommon.common.ErrorCode;
import com.king.kingapicommon.model.entity.UserInterfaceInfo;
import com.king.kingapicommon.service.InnerUserInterfaceInfoService;
import com.king.project.exception.BusinessException;
import com.king.project.service.UserInterfaceInfoService;
import com.king.project.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;


import javax.annotation.Resource;

/**
 * @author King
 * @Description:
 */

@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Resource
    private UserService userService;

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }

    @Override
    public boolean invokeLeftNum(long interfaceInfoId, long userId) {
        return false;
    }

    @Override
    public Boolean addDefaultUserInterfaceInfo(Long interfaceId, Long userId) {
        UserInterfaceInfo userInterfaceInfo = new UserInterfaceInfo();
        userInterfaceInfo.setUserId(userId);
        userInterfaceInfo.setInterfaceInfoId(interfaceId);
        userInterfaceInfo.setLeftNum(999);

        return userInterfaceInfoService.save(userInterfaceInfo);
    }

    @Override
    public UserInterfaceInfo checkUserHasInterface(long interfaceId, long userId) {
        if (interfaceId <= 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        return userInterfaceInfoService.lambdaQuery()
                .eq(UserInterfaceInfo::getUserId, userId)
                .eq(UserInterfaceInfo::getInterfaceInfoId, interfaceId)
                .one();
    }
}
