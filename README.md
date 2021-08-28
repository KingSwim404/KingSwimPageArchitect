# KingSwimPageArchitect

## 零、项目介绍：

- 搭建一个项目的基础组件

- 先定义规范，然后开始写代码

- 重点定义网络请求配置、单Activity多Fragment的加载方式、多类型列表加载方式

  

## 一、文件介绍：

- AppConfig ：

  一些基本配置   versionName、versionCode等等

  第三库配置

  

- BaseBridge：

  一些可能会有变化的库，不要直接使用。要在这里面代理一下，方便后续替换。

- BaseHttp

  网络请求相关配置模块

  

- BaseLibrary

  和业务无关的，通用逻辑模块

  

- BasePageArchitect

  基础界面加载模块。主要使用单Activity多Fragment加载

- BaseResource

  图片、文本等通用资源模块，避免重复定义

  

- BaseWeb

  Web相关的通用配置模块

  

- BusinessAModule

  随意定义的业务模块

  

- BusinessBModule

  随意定义的业务模块

  

- Examples

  示例代码模块，用以演示代码规范以及部分模块的使用

  

- TrainingJavaOrKotlin

  用以测试非Android逻辑相关的代码模块

  

- Xdocuments

  文档目录

## 二、授权协议：

- [MIT](https://github.com/KingSwim404/KingSwimPageArchitect/blob/master/LICENSE)



​            



