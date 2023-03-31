package com.king.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.king.kingapicommon.model.entity.InterfaceInfo;

/**
 *
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
