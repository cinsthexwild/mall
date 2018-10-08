package com.earth.mall.common;

public class StatusCode {

    public static int SUCCESS = 0; // 访问成功
    public static int ERROR = 1001; // 访问错误
    public static int ERROR_PARAMETER = 1002; // 参数错误
    public static int ERROR_PROGRAM = 1003; // 程序异常
    public static int ERROR_NO_LOGIN_OR_TIMEOUT = 1004; // 未登录或登录超时,请重新登录
    public static int ERROR_EXIST_OPERATION = 1005; // 已操作

}
