-- 用户调用接口关系表

-- 切换库
use kingapi;

create table if not exists user_interface_info
(
    id            bigint not null auto_increment comment 'id' primary key,
    userId        bigint not null comment '调用用户 id',
    interfaceInfoId        bigint not null comment '接口 id',
    totalNum       int     default 0 not null comment '总调用次数',
    leftNum       int     default 0 not null comment '剩余调用次数',
    status       int     default 0 not null comment '0-正常， 1-禁用',
    createTime    datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    updateTime    datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete      tinyint  default 0                 not null comment '是否删除'
) comment '用户调用接口关系表';