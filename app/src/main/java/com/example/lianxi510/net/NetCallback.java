package com.example.lianxi510.net;

/**
 * 作者:麦腾阳
 * WeChat:15010563550
 * Description:
 */
public interface NetCallback {
    //响应成功
    void onSuccess(String result);
    //响应失败
    void onFail(String msg);
}
