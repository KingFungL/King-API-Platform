package com.king.project.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.king.kingapicommon.model.entity.UserInterfaceInfo;

import java.util.List;
import java.util.Map;

/**
* @author liangjingfeng
* @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Mapper
* @createDate 2023-03-16 15:43:49
* @Entity generator.domain.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    //select interfaceInfoId, sum(totalNum) as totalNum from user_interface_info group by interfaceInfoId order by totalNum desc limit 3;
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




