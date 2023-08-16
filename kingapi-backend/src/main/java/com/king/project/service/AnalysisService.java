package com.king.project.service;

import com.king.kingapicommon.common.BaseResponse;
import com.king.kingapicommon.model.vo.InterfaceInfoVO;

import java.util.List;

/**
 * @author King
 * @Description:
 */
public interface AnalysisService {

    BaseResponse<List<InterfaceInfoVO>> listTopInvokeInterfaceInfo();
}
