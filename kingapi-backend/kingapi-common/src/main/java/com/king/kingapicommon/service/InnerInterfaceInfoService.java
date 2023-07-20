package com.king.kingapicommon.service;


import com.king.kingapicommon.model.entity.InterfaceInfo;

/**
 * @author  King
 * @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
 */
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟接口是否存在（请求路径、请求方法）
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
