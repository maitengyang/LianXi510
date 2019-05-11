package com.example.lianxi510.mvp.presenter;

import android.content.Context;
import android.net.Uri;

import com.example.lianxi510.bean.User;
import com.example.lianxi510.net.NetCallback;

import java.util.Map;

/**
 * 作者:麦腾阳
 * WeChat:15010563550
 * Description:
 */
public interface IUserContract {
    /**用户v接口
     *
     */
    public interface IUserView{
        void registSuccess(String result);
        //注册失败
        void registFail();
        //登录成功
        void loginSuccess(String result);
        //登录失败
        void  loginFail();
    }
    //用户M接口
    public interface IUserModel{
        //和网络交互 让参数用用一些
        void doHttpPost(String url, Map<String,String> param,NetCallback netcallback);
    }
    /**
     * 用户接口
     * 业务
     */
    public interface IUserPresenter{
        /**
         * 绑定view
         *
         */
        void attach(IUserView view);
        //解绑 释放内存
        void detach();
        //注册业务逻辑
        void regist(User user);
        //登录业务逻辑
        void login(User user);
        /**
         * 把电话和密码 封装成User
         */
        User inputToUser(String phone,String pwd);
        //跳转到主界面
        void toMain(Context context);
    }

}
