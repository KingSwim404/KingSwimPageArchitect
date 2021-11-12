### 一、项目目的：

​      多年经验的总结记录。

​     了解面向对象、项目痛点

### 二、项目原则：

​     封装足够简单，封装层数一般不超过2层

### 三、模块分解：

1. Application初始化
   1. doFirst       最开始执行
   2. doInMain   主线程执行
   3. doInBackground 后台线程执行 
   4. doAfterMainBackground  主线程任务执行完成后才开始执行的后台线程
2. 原生页面
   1. 普通界面跳转（Activity、Fragment）
   2. 取返回值界面跳转
   3. BaseActivity、BaseFragment抽象
   4. ListView 、Adapter数据加载抽象
   5. 单Activity设计
   6. 权限处理
3. 网络
   1. Retrofit、RxHttp（设计缓存）
   2. 设计多host
   3. 设计多Response
   4. 设计错误统一处理
   5. 数据模拟
   6. token过期
   7. 加密、解密
   8. 图片下载
4. Web页面
   1. Cordova
   2. 非Cordova
5. 模块开发
   1. 模块间通讯
6. 数据存储
   1. Room
   2. mmkv或者DataSoure (注意提供加密)
7. 其他
   1. 

