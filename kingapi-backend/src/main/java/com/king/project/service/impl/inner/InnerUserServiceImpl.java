package com.king.project.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.king.kingapicommon.model.entity.User;
import com.king.kingapicommon.service.InnerUserService;
import com.king.project.common.ErrorCode;
import com.king.project.exception.BusinessException;
import com.king.project.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Resource;

/**
 * @author King
 * @Description:
 */
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getInvokeUser(String accessKey, String secretKey) {
        if (StringUtils.isAnyBlank(accessKey)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey", accessKey);
        queryWrapper.eq("secretKey", secretKey);
        return userMapper.selectOne(queryWrapper);
    }

}
