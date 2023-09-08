# kingF Open-API

#### 介绍
API开放式平台:一个丰富的API开放调用平台，为开发者提供便捷、实用、安全的API调用体验；
在线体验地址：[Open-API](http://175.178.15.235/)

#### 系统架构
![系统架构图](https://github.com/KingFungL/King-API-Platform/blob/version-06/image/API%E7%B3%BB%E7%BB%9F%E6%9E%B6%E6%9E%84%E5%9B%BE.png)


#### 技术实现

### 后端技术栈

- 主语言：Java
- 框架：SpringBoot 2.7.0、Mybatis-plus、Spring Cloud
- 数据库：Mysql8.0、Redis
- 中间件：RabbitMq
- 注册中心：Nacos
- 服务调用：Dubbo
- 网关：Spring Cloud Gateway
- 负载均衡：Spring cloud Loadbalancer

### 前端技术栈

- 开发框架：React、Umi
- 脚手架：Ant Design Pro
- 组件库：Ant Design、Ant Design Components
- 打包工具：Webpack

## 功能模块

> 🌟 亮点功能 🚀 未来计划

- 用户、管理员
    - 🌟登录注册：使用令牌桶算法实现手机短信(邮箱)接口的限流，保护下游服务
    - 个人主页，包括上传头像，显示密钥，重新生成ak,sk
    - 管理员：用户管理
    - 管理员：接口管理
    - 管理员：接口分析、订单分析
- 接口
    - 浏览接口信息
    - 🌟 数字签名校验接口调用权限
    - 🌟 SDK调用接口
    - 接口搜索 (🚀 )
    - 购买接口
    - 下载SDK
    - 用户上传自己的接口（🚀）
- 订单
    - 创建订单
    - 订单超时回滚
    - 支付宝沙箱支付