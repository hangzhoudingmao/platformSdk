## 公共中心接口SDK说明文档

**几个主要的类介绍**

|       类名              |           作用                           |       成功回调       | 失败回调                                          |
| --------------------- | -------------------- | ------------------| ----------- |
| `PlatformClient`          | 包含所有需要的请求函数（例如登录，发送短信） | 无           |     无                                                   |
| `PlatformCallback<T>`     | 回调接口                             |`onSuccess(T t)`,`onListSuccess(List<T> list)` |  `onFailed(String msg)` |
| `PlatformListCallback<T>` | 回调接口                             |`onSuccess(List<T> list)` | `onFailed(String msg)`                       |
| `PlatformStringCallback` |  回调接口                             |`onSuccess(String msg)` | `onFailed(String msg)`                         |

回调默认都是在主线程执行

泛型（T）: 返回需要的数据类

PlatformCallback: onListSuccess(List<T> list) 该回调函数的功能是返回一个数组包含的类,默认不需要实现

### 接入管理

#### 通用登录接口

```
PlatformClient.doLogin(new LoginByPwdReq("zhangsan", "123456"), new PlatformCallback<LoginResponse>() {
                @Override
                public void onSuccess(LoginResponse o) {
                    //做一些成功的处理
                 }
    
                @Override
                public void onFailed(String msg) {
                   //做一些失败的处理
                }
    
                @Override
                public void onTokenInvalid(String msg) { }
            });
```
**LoginByPwdReq**: 请求类 需要传入账号,密码

**LoginResponse**: 返回类 包含需要的数据

### 基础服务

#### 上传文件

>请求参数

**body**

| 参数名称       | 参数类型     | 参数说明 | 必传 |
| -------------| ---------- | -------|-------|
| pic_file_apk  | File       | 文件   | 是 |
| rela_id       | String     | 业务关联Id | 否 |
| module        | String     | 模块编码   | 否 |

```
PlatformClient.doUploadFile(Map<String,String> map, File file,String fileKey,PlatformCallback<UploadFileResponse> callback)
```

#### 导出权限项、菜单、标准码表数据SQL脚本

**request**: TableDataRequest

**response**: TableDataResponse

```
PlatformClient.doExportTable(TableDataRequest dataRequest, PlatformCallback<TableDataResponse> callback)
```

#### 获取文件列表

**request**: FileListRequest

**response**: FileListResponse

```
PlatformClient.doFileList(FileListRequest fileListRequest, PlatformCallback<FileListResponse> callback)
```

#### 删除文件

**request**: FileDeleteRequest

```
PlatformClient.doDeleteFile(FileDeleteRequest request, PlatformStringCallback callback)
```

#### 日志上报

**request**: UploadLogRequest

```
PlatformClient.doUploadLog(List<UploadLogRequest> list,PlatformStringCallback callback)
```

#### 发送短信

**request**: SendMsgRequest

**response**: SendMsgResponse

```
PlatformClient.doSendMsg(SendMsgRequest request, PlatformCallback<SendMsgResponse> callback)
```

#### 发送短信_群发

**request**: SmsGroupReq

**response**: SendMsgResponse

```
PlatformClient.doSendSms(List<SmsGroupReq> list, PlatformCallback<SendMsgResponse> callback)
```

#### 获取短信发送记录

**request**: SmsListRequest

**response**: SmsListResponse

```
PlatformClient.doSmsList(SmsListRequest request, PlatformCallback<SmsListResponse> callback)
```

#### 短信模版创建

**request**: SmsTempCreateRequest

**response**: SmsTempCreateResponse

```
PlatformClient.doSmsTempCreate(SmsTempCreateRequest request, PlatformCallback callback)
```

#### 获取短信模板

**request**: SmsTempGetRequest

**response**: SmsTempGetResponse

```
PlatformClient.doSmsTempGet(SmsTempGetRequest smsTempGetRequest, PlatformCallback callback)
```

#### 发送验证码

**request**: SendCodeRequest

**response**: SendCodeResponse

```
PlatformClient.doSendCode(SendCodeRequest sendCodeRequest, PlatformStringCallback callback)
```

#### 校验验证码

**request**: CheckCodeRequest

```
PlatformClient.doCheckCode(CheckCodeRequest mCheckCodeRequest, PlatformStringCallback callback)
```

#### 获取区域树

**request**: AreaTreeRequest

**response**: AreaTreeResponse

```
PlatformClient.doAreaTree(AreaTreeRequest areaTreeRequest, PlatformListCallback callback)
```

#### 区域-下拉框-省列表

**request**: BoxProvinceRequest

**response**: BoxProvinceResponse

```
PlatformClient.doProvince(BoxProvinceRequest mAreaBoxProRequest, PlatformListCallback callback)
```

#### 区域-下拉框-市列表

**request**: BoxCityRequest

**response**: BoxCityResponse

```
PlatformClient.doCity(BoxCityRequest boxCityRequest, PlatformListCallback callback)
```

#### 区域-下拉框-区列表

**request**: BoxAreaRequest

**response**: BoxAreaResponse

```
PlatformClient.doArea(BoxAreaRequest boxAreaRequest, PlatformListCallback callback)
```

#### 区域-下拉框-街道列表

**request**: BoxStreeRequest

**response**: BoxStreeResponse

```
PlatformClient.doStree(BoxStreeRequest boxStreeRequest, PlatformListCallback callback)
```

#### 获取OSS地址

**response**: OssResponse

```
PlatformClient.doOSS(PlatformCallback callback)
```