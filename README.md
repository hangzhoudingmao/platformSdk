## 公共中心接口SDK说明文档

**几个主要的类介绍**

|       类名      |           作用      |       成功回调       | 失败回调    |
| ------------- | -------------------- |------------------ | ----------- |
| `PlatformClient`  | 包含所有需要的请求函数（例如登录，发送短信） | 无 | 无|
| `PlatformCallback<T>`  | 回调接口  |`onSuccess(T t)`,`onListSuccess(List<T> list)` | `onFailed(String msg)` |
| `PlatformListCallback<T>` | 回调接口  |`onSuccess(List<T> list)` | `onFailed(String msg)` |
回调默认都是在主线程执行

泛型（T）: 返回需要的数据类

PlatformCallback: onListSuccess(List<T> list) 该回调函数的功能是返回一个数组包含的类,默认不需要实现

### 接入管理

#### 通用登录接口

> 基本信息

**path**: /api/v1/access/login/do_login

**method**: POST

**request**: {"user_no":"13575776011","password":"hz123456", "login_type":"1"}

**response**:{"code":0,"msg":"SUCCESS","action":"api_v1_access_login_do_login","data":{"user_id":"304","comp_id":"17","org_no":"001001","dept_no":"005","is_admin":"0","user_type":"4","user_no":"13575776011","user_name":"13575776011","phone":"13575776011","mail":"13575776011@qq.com","avatar":"console/upload/industry/pic/u=3325973037,2445086895&fm=26&gp=0.jpg","status":"1","audit_status":"2","system_no":"ass","sid":0,"company_type":"1","business_types":"1,2,3,4,5,6,7,8","job_list":[{"user_id":"304","job_id":"96","job_name":"工业化项目组","company_id":"17","dept_id":"66","dept_no":"005","dept_name":"技术部（dept）","dept_type":"1","p_dept_id":null,"p_dept_no":"","p_dept_name":null,"org_id":"67","org_no":"001001","org_name":"测试集团（org）","org_type":"2","p_org_id":"39","p_org_no":"001","p_org_name":"丁卯"}],"org_type":"2","access_token":"","refresh_token":""}}

#### java代码
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