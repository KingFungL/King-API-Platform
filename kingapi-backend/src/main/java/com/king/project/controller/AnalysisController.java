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
    private UserInterfaceInfoMapper userInterfaceInfoMapper;

    @Resource
    private InterfaceInfoService interfaceInfoService;

    @GetMapping("/top/interface/invoke")
    @AuthCheck(mustRole = "admin")
    public BaseResponse<List<InterfaceInfoVO>> listTopInvokeInterfaceInfo() {
        // 查询调用次数前3名的接口
        List<UserInterfaceInfo> userInterfaceInfoList = userInterfaceInfoMapper.listTopInvokeInterfaceInfo(3);
        if (CollectionUtils.isEmpty(userInterfaceInfoList)) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR);
        }
        // 根据接口id分组
        Map<Long, List<UserInterfaceInfo>> interfaceInfoIdObjMap = userInterfaceInfoList.stream()
                .collect(Collectors.groupingBy(UserInterfaceInfo::getInterfaceInfoId));
        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id", interfaceInfoIdObjMap.keySet());
        // 查询所有接口id的接口信息
        List<InterfaceInfo> list = interfaceInfoService.list(queryWrapper);
        if (CollectionUtils.isEmpty(list)) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR);
        }
        // 组装返回结果
        List<InterfaceInfoVO> interfaceInfoVOList = list.stream().map(interfaceInfo -> {
            InterfaceInfoVO interfaceInfoVO = new InterfaceInfoVO();
            BeanUtils.copyProperties(interfaceInfo, interfaceInfoVO);
            int totalNum = interfaceInfoIdObjMap.get(interfaceInfo.getId()).get(0).getTotalNum();
            interfaceInfoVO.setTotalNum(totalNum);
            return interfaceInfoVO;
        }).collect(Collectors.toList());
        return ResultUtils.success(interfaceInfoVOList);
    }
}
