package com.example.lianxi510.net;

import android.os.Handler;

import java.util.Map;

/**
 * 作者:麦腾阳
 * WeChat:15010563550
 * Description:
 */
public class HttpUtil {
    private static final HttpUtil ourInstance=new HttpUtil();
    private Handler mHandler;
    public static HttpUtil getOnstance(){
        return ourInstance;
    }
    private HttpUtil(){
        mHandler=new Handler();
    }
    /**
     * post请求数据
     */
    public void doHttpPost(final String url, final Map<String,String> param
            ,final NetCallback callback ){
        new Thread(){
            @Override
            public void run() {
                super.run();
            }
        }.start();
    }
}
