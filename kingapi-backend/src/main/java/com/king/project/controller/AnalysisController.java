package com.king.project.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.king.kingapicommon.common.BaseResponse;
import com.king.kingapicommon.common.ErrorCode;
import com.king.kingapicommon.common.ResultUtils;
import com.king.kingapicommon.model.entity.InterfaceInfo;
import com.king.kingapicommon.model.entity.UserInterfaceInfo;
import com.king.kingapicommon.model.vo.InterfaceInfoVO;
import com.king.project.annotation.AuthCheck;
import com.king.project.exception.BusinessException;
import com.king.project.mapper.UserInterfaceInfoMapper;
import com.king.project.service.AnalysisService;
import com.king.project.service.InterfaceInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author King
 * @Description: 分析控制器
 */
@RestController
@RequestMapping("/analysis")
@Slf4j
public class AnalysisController {

    @Resource
    private AnalysisService analysisService;

    @GetMapping("/top/interface/invoke")
    @AuthCheck(mustRole = "admin")
    public BaseResponse<List<InterfaceInfoVO>> listTopInvokeInterfaceInfo() {
        return analysisService.listTopInvokeInterfaceInfo();
    }
}
