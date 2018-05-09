package com.example.basemodel.cans;

/**
 * Created by Administrator on 2016/12/22.
 */

public final class Constants {

    public static final int SUCCESS = 200;//服务器返回成功
    public static final int SESSIONID_OUT_OF_TIME = 401;//两个设备登录
    public static final String OSNAME = "A";//操作系统

    public static final int SQUARE_PAGE_COUNT = 3;

    public static final int PAGE_BKTJ = 0;
    public static final int PAGE_YXHD = 1;
    public static final int PAGE_ZTLB = 2;


    public static final String TYPE = "type";


    /**
     * 1：短信验证码
     * 2：图形验证码
     */
    public static final String DXYZM = "1";
    public static final String TXYZM = "2";


    public static final String REGIST_bizType = "10";//注册
    public static final String LOGIN_bizType = "11";//登录
    public static final String FINDPWD_bizType = "12";//找回密码
    public static final String RECIVE_bizType = "13";//发送短信验证码

    public static final String SEND_MESSAGE_TEST="SEND_MESSAGE_TEST";//RxBus发送消息测试

}
