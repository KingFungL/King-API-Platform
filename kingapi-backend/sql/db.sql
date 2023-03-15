use kingapi;
-- 接口信息表
create table if not exists kingapi.`interface_info`
(
    `id` bigint not null auto_increment comment '主键' primary key,
    `name` varchar(256) not null comment '用户名',
    `description` varchar(256) null comment '描述',
    `url` varchar(512) not null comment '接口地址',
    `requestParams` text not null comment '请求参数',
    `requestHeader` text null comment '请求头',
    `responseHeader` text null comment '响应头',
    `userId` varchar(256) not null comment '创建人',
    `status` int default 0 not null comment '接口状态（0 - 关闭， 1 - 开启））',
    `method` varchar(256) not null comment '请求类型',
    `createTime` datetime default 'CURRENT_TIMESTAMP' not null comment '创建时间',
    `updateTime` datetime default 'CURRENT_TIMESTAMP' not null on update CURRENT_TIMESTAMP comment '更新时间',
    `isDelete` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
) comment '接口信息表';

insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('徐绍齐', '李浩宇', 'www.dennis-kris.info', '5FY', 'V7vWz', '644205', 0, '杜靖琪');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('龚文昊', '史鹏煊', 'www.arie-heller.co', 'dwE', 'HrHz', '24483', 0, '江胤祥');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('陈建辉', '武风华', 'www.clay-goldner.name', 'NA1Wa', 'MrvK', '970705', 0, '雷越泽');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('尹炫明', '贾昊天', 'www.vesta-runolfsson.com', 'Io', '8fWcb', '330678825', 0, '韩胤祥');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('郭思远', '陆思远', 'www.lorenzo-senger.net', '7bfa', 'UYvFe', '6687919360', 0, '沈建辉');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('彭子骞', '熊哲瀚', 'www.harold-heathcote.io', 'AA', 'Xpf', '520613', 0, '程致远');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('孟烨华', '洪明杰', 'www.freeman-raynor.com', 'MzJm', 'ehcbw', '79', 0, '朱浩轩');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('贺昊天', '姜建辉', 'www.romelia-bosco.org', 'bk06R', 'ye', '7823751405', 0, '崔致远');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('孙锦程', '严荣轩', 'www.joanne-jast.name', '2nW', 'HIJVw', '16', 0, '贺哲瀚');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('高鸿煊', '钟语堂', 'www.lisabeth-veum.org', 'Fn', 'ifo', '9530893036', 0, '朱智宸');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('周梓晨', '严鹏煊', 'www.kanisha-rath.net', 's3sh', '0sNfW', '1723387118', 0, '王烨华');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('郑博超', '贺立果', 'www.roseanna-hagenes.org', 'bAu', 'XJ', '2841328', 0, '董修洁');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('覃耀杰', '沈鹏飞', 'www.abram-block.info', 'M5C', 'M7M1n', '2815666355', 0, '石弘文');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('贺鑫磊', '汪天磊', 'www.malika-kuhic.net', 'DXm2', 'yq2E', '161188719', 0, '严昊天');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('雷烨伟', '钟昊天', 'www.willis-ward.net', 'xR3F9', '0wNL', '64807', 0, '蔡立果');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('姜文博', '钱晟睿', 'www.lavern-borer.net', 'RSW', 'i14im', '458', 0, '彭浩然');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('黎鹤轩', '钟擎苍', 'www.jettie-gleason.name', 'g0', 'SY', '636977153', 0, '陶耀杰');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('黎楷瑞', '武文', 'www.ronald-ondricka.co', 'PGx', 'IHD6K', '66894', 0, '杜雪松');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('段鹏涛', '雷越泽', 'www.mose-purdy.org', 'Zw9b', 'tUL', '6413785854', 0, '袁驰');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('武煜城', '宋凯瑞', 'www.jarrett-konopelski.io', '9O', 'XSS', '4506481', 0, '胡鹏煊');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('谭伟泽', '雷浩宇', 'www.bo-gleichner.name', '24jn', 'ep1', '36602470', 0, '崔子涵');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('傅凯瑞', '杜远航', 'www.dusty-jacobson.co', 'H1Gf', 'm0', '795575086', 0, '杨智渊');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('马智辉', '贺伟宸', 'www.hollis-walker.name', 'j7uGC', 'Afr', '44493', 0, '贺昊焱');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('金鸿煊', '夏文', 'www.carline-schowalter.info', 'sltz', 'Jt', '64384265', 0, '宋晓博');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('石振家', '段建辉', 'www.augustine-barton.info', 'ROwvg', 'yDqi', '21430219', 0, '方浩然');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('汪嘉懿', '韩胤祥', 'www.freddie-walsh.info', 'XJILS', 'tyswz', '764137590', 0, '林子骞');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('潘彬', '郝烨霖', 'www.hilton-senger.io', 'j6', 'szJY', '48697233', 0, '杨鹏涛');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('崔健柏', '范浩然', 'www.walton-runte.biz', 'm7ij0', 'eaLQ', '3', 0, '王文昊');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('魏致远', '戴浩轩', 'www.philip-baumbach.com', 'EOn9', 'Uv', '3755', 0, '唐明轩');
insert into kingapi.`interface_info` (`name`, `description`, `url`, `requestHeader`, `responseHeader`, `userId`, `status`, `method`) values ('姜琪', '谭皓轩', 'www.avis-ebert.co', 'jt5Qq', 'Ap0Um', '67882', 0, '石皓轩');