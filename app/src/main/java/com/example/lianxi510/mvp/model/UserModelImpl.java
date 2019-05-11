package com.example.lianxi510.mvp.model;

import com.example.lianxi510.mvp.presenter.IUserContract;
import com.example.lianxi510.net.NetCallback;

import java.util.Map;

/**
 * 作者:麦腾阳
 * WeChat:15010563550
 * Description:
 */
public class UserModelImpl implements IUserContract.IUserModel {

    //单例模式


    @Override
    public void doHttpPost(String url, Map<String, String> param, NetCallback netcallback) {

    }
}
