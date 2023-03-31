package com.king.project.service.impl.inner;

import com.king.kingapicommon.service.InnerUserInterfaceInfoService;
import com.king.project.service.UserInterfaceInfoService;


import javax.annotation.Resource;

/**
 * @author King
 * @Description:
 */
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }

}
