package com.example.basemodel.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/5/8.
 */

public class LoginInforBean {

    /**
     * code : 200
     * data : {"expire":3600,"obj":{"birthday":"2017-12-12","companyId":1,"companyName":"浙江华坤道威数据科技有限公司","createTime":1507700296000,"email":"tangzhen@worken.com","headName":"1508465236302_197.jpeg","headUrl":"http://192.168.0.155//images/userHead/1508465236302_197.jpeg","id":197,"isAdmin":1,"isEmailValid":0,"isMobileValid":0,"job":"总经理","lastLoginTime":1513073437000,"loginName":"tangzhen","mobile":"15669098696","qq":"","sex":"女","status":1,"sysResList":[{"comId":1,"createTime":1506673067000,"displayCreateTime":"2017-09-29 16:17:47","icon":"shouye","id":65,"parentId":1,"resClass":"homeli","resCode":"home","resName":"首页","resType":1,"resUrl":"/view/index.html","status":1,"type":0,"updateTime":1513218974000},{"comId":1,"createTime":1506673154000,"displayCreateTime":"2017-09-29 16:19:14","icon":"kehu","id":66,"parentId":1,"resClass":"customerli","resCode":"cust","resName":"客户","resType":1,"resUrl":"","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1506673162000,"displayCreateTime":"2017-09-29 16:19:22","icon":"yingxiaoxinxi","id":67,"parentId":1,"resClass":"marketli","resCode":"touch","resName":"触达","resType":1,"resUrl":"","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507625755000,"displayCreateTime":"2017-10-10 16:55:55","icon":"","id":68,"parentId":66,"resClass":"clue","resCode":"clue","resName":"线索需求","resType":2,"resUrl":"/view/customer/workOrder/workOrder.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1506673181000,"displayCreateTime":"2017-09-29 16:19:41","icon":"","id":69,"parentId":66,"resClass":"customer","resCode":"cust","resName":"客户管理","resType":2,"resUrl":"/view/customer/customer/customer.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1506673221000,"displayCreateTime":"2017-09-29 16:20:21","icon":"","id":70,"parentId":67,"resClass":"pagetouch","resCode":"page","resName":"微页面","resType":2,"resUrl":"/view/marketing/micro/micropage.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507610643000,"displayCreateTime":"2017-10-10 12:44:03","icon":"jikediancanicon45","id":71,"parentId":1,"resClass":"analyli","resCode":"analysis","resName":"分析","resType":1,"resUrl":"","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507610674000,"displayCreateTime":"2017-10-10 12:44:34","icon":"","id":72,"parentId":71,"resClass":"pageanalysis","resCode":"pageAnaly","resName":"微页面数据","resType":2,"resUrl":"/view/marketing/micro/microdata.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1506673172000,"displayCreateTime":"2017-09-29 16:19:32","icon":"","id":73,"parentId":66,"resClass":"group","resCode":"group","resName":"群组","resType":2,"resUrl":"/view/customer/group/group.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507629759000,"displayCreateTime":"2017-10-10 18:02:39","icon":"","id":74,"parentId":67,"resClass":"smstouch","resCode":"sms","resName":"短信触达","resType":2,"resUrl":"/view/marketing/sms/smspage.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507629807000,"displayCreateTime":"2017-10-10 18:03:27","icon":"","id":75,"parentId":67,"resClass":"emailtouch","resCode":"email","resName":"邮件触达","resType":2,"resUrl":"/view/marketing/email/email.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507629936000,"displayCreateTime":"2017-10-10 18:05:36","icon":"","id":76,"parentId":67,"resClass":"wechatGrouptouch","resCode":"wechatGroup","resName":"微信群触达","resType":2,"resUrl":"/view/marketing/wechat/wechatgroup.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507630224000,"displayCreateTime":"2017-10-10 18:10:24","icon":"","id":77,"parentId":67,"resClass":"calltouch","resCode":"call","resName":"电话触达","resType":2,"resUrl":"/view/marketing/call/callMarketList.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507630300000,"displayCreateTime":"2017-10-10 18:11:40","icon":"","id":78,"parentId":67,"resClass":"flashtouch","resCode":"flash","resName":"弹信触达","resType":2,"resUrl":"/view/marketing/FlashSMS/list.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507631335000,"displayCreateTime":"2017-10-10 18:28:55","icon":"","id":79,"parentId":71,"resClass":"smsanalysis","resCode":"smsAnaly","resName":"短信数据","resType":2,"resUrl":"/view/marketing/sms/smsdata.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507631365000,"displayCreateTime":"2017-10-10 18:29:25","icon":"","id":80,"parentId":71,"resClass":"emailanalysis","resCode":"emailAnaly","resName":"邮件数据","resType":2,"resUrl":"/view/marketing/email/emaildata.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507631397000,"displayCreateTime":"2017-10-10 18:29:57","icon":"","id":81,"parentId":71,"resClass":"custGroupanalysis","resCode":"custGroup","resName":"客群分析","resType":2,"resUrl":"/view/Analysis/custAnalysis.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507631440000,"displayCreateTime":"2017-10-10 18:30:40","icon":"shezhi","id":82,"parentId":1,"resClass":"setli","resCode":"setting","resName":"设置","resType":1,"resUrl":"","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507631450000,"displayCreateTime":"2017-10-10 18:30:50","icon":"","id":83,"parentId":82,"resClass":"systemSet","resCode":"sysSetting","resName":"系统设置","resType":2,"resUrl":"/view/setting/setting.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507631752000,"displayCreateTime":"2017-10-10 18:35:52","icon":"","id":84,"parentId":82,"resClass":"departSet","resCode":"depart","resName":"部门/职位管理","resType":2,"resUrl":"/view/setting/partialmanagement/partialmanagement.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507632773000,"displayCreateTime":"2017-10-10 18:52:53","icon":"","id":85,"parentId":82,"resClass":"roleSet","resCode":"role","resName":"角色/权限管理","resType":2,"resUrl":"/view/setting/role/role.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507699539000,"displayCreateTime":"2017-10-11 13:25:39","icon":"","id":86,"parentId":82,"resClass":"userSet","resCode":"user","resName":"用户管理","resType":2,"resUrl":"/view/setting/usermanagement/usermanagement.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1510054915000,"displayCreateTime":"2017-11-07 19:41:55","icon":"","id":87,"parentId":88,"resClass":"个人设置","resCode":"task","resName":"任务管理","resType":2,"resUrl":"","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1510056159000,"displayCreateTime":"2017-11-07 20:02:39","icon":"","id":88,"parentId":1,"resClass":"personalSetting","resCode":"personalSetting","resName":"个人设置","resType":1,"resUrl":"","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1511858680000,"displayCreateTime":"2017-11-28 16:44:40","icon":"","id":89,"parentId":82,"resClass":"","resCode":"res","resName":"菜单管理","resType":2,"resUrl":"/view/setting/menu/menu.html","status":1,"type":0,"updateTime":1513149771000}],"type":0,"upperId":163,"userName":"唐震","weixinId":""},"token":"eyJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1MTMzMDkwNzIsInN1YiI6InRhbmd6aGVuIiwiZXhwIjoxNTEzMzEyNjcyLCJqdGkiOiIxZThlMDkzMzg5MWE0OWJhYjgyZDQwZDlmNGEzNzUxOCIsInVpZCI6MTk3LCJlIjozNjAwLCJhdWQiOiI5ZjRkNDg0NWYzNTE0MWU2YmRiZmQ2MzIxNzU0YTA0OSJ9.lLk9R0X6dd1knI_UAT0-Fac0BAwNT6CmxRnKbFIH480"}
     */

        /**
         * expire : 3600
         * obj : {"birthday":"2017-12-12","companyId":1,"companyName":"浙江华坤道威数据科技有限公司","createTime":1507700296000,"email":"tangzhen@worken.com","headName":"1508465236302_197.jpeg","headUrl":"http://192.168.0.155//images/userHead/1508465236302_197.jpeg","id":197,"isAdmin":1,"isEmailValid":0,"isMobileValid":0,"job":"总经理","lastLoginTime":1513073437000,"loginName":"tangzhen","mobile":"15669098696","qq":"","sex":"女","status":1,"sysResList":[{"comId":1,"createTime":1506673067000,"displayCreateTime":"2017-09-29 16:17:47","icon":"shouye","id":65,"parentId":1,"resClass":"homeli","resCode":"home","resName":"首页","resType":1,"resUrl":"/view/index.html","status":1,"type":0,"updateTime":1513218974000},{"comId":1,"createTime":1506673154000,"displayCreateTime":"2017-09-29 16:19:14","icon":"kehu","id":66,"parentId":1,"resClass":"customerli","resCode":"cust","resName":"客户","resType":1,"resUrl":"","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1506673162000,"displayCreateTime":"2017-09-29 16:19:22","icon":"yingxiaoxinxi","id":67,"parentId":1,"resClass":"marketli","resCode":"touch","resName":"触达","resType":1,"resUrl":"","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507625755000,"displayCreateTime":"2017-10-10 16:55:55","icon":"","id":68,"parentId":66,"resClass":"clue","resCode":"clue","resName":"线索需求","resType":2,"resUrl":"/view/customer/workOrder/workOrder.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1506673181000,"displayCreateTime":"2017-09-29 16:19:41","icon":"","id":69,"parentId":66,"resClass":"customer","resCode":"cust","resName":"客户管理","resType":2,"resUrl":"/view/customer/customer/customer.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1506673221000,"displayCreateTime":"2017-09-29 16:20:21","icon":"","id":70,"parentId":67,"resClass":"pagetouch","resCode":"page","resName":"微页面","resType":2,"resUrl":"/view/marketing/micro/micropage.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507610643000,"displayCreateTime":"2017-10-10 12:44:03","icon":"jikediancanicon45","id":71,"parentId":1,"resClass":"analyli","resCode":"analysis","resName":"分析","resType":1,"resUrl":"","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507610674000,"displayCreateTime":"2017-10-10 12:44:34","icon":"","id":72,"parentId":71,"resClass":"pageanalysis","resCode":"pageAnaly","resName":"微页面数据","resType":2,"resUrl":"/view/marketing/micro/microdata.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1506673172000,"displayCreateTime":"2017-09-29 16:19:32","icon":"","id":73,"parentId":66,"resClass":"group","resCode":"group","resName":"群组","resType":2,"resUrl":"/view/customer/group/group.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507629759000,"displayCreateTime":"2017-10-10 18:02:39","icon":"","id":74,"parentId":67,"resClass":"smstouch","resCode":"sms","resName":"短信触达","resType":2,"resUrl":"/view/marketing/sms/smspage.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507629807000,"displayCreateTime":"2017-10-10 18:03:27","icon":"","id":75,"parentId":67,"resClass":"emailtouch","resCode":"email","resName":"邮件触达","resType":2,"resUrl":"/view/marketing/email/email.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507629936000,"displayCreateTime":"2017-10-10 18:05:36","icon":"","id":76,"parentId":67,"resClass":"wechatGrouptouch","resCode":"wechatGroup","resName":"微信群触达","resType":2,"resUrl":"/view/marketing/wechat/wechatgroup.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507630224000,"displayCreateTime":"2017-10-10 18:10:24","icon":"","id":77,"parentId":67,"resClass":"calltouch","resCode":"call","resName":"电话触达","resType":2,"resUrl":"/view/marketing/call/callMarketList.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507630300000,"displayCreateTime":"2017-10-10 18:11:40","icon":"","id":78,"parentId":67,"resClass":"flashtouch","resCode":"flash","resName":"弹信触达","resType":2,"resUrl":"/view/marketing/FlashSMS/list.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507631335000,"displayCreateTime":"2017-10-10 18:28:55","icon":"","id":79,"parentId":71,"resClass":"smsanalysis","resCode":"smsAnaly","resName":"短信数据","resType":2,"resUrl":"/view/marketing/sms/smsdata.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507631365000,"displayCreateTime":"2017-10-10 18:29:25","icon":"","id":80,"parentId":71,"resClass":"emailanalysis","resCode":"emailAnaly","resName":"邮件数据","resType":2,"resUrl":"/view/marketing/email/emaildata.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507631397000,"displayCreateTime":"2017-10-10 18:29:57","icon":"","id":81,"parentId":71,"resClass":"custGroupanalysis","resCode":"custGroup","resName":"客群分析","resType":2,"resUrl":"/view/Analysis/custAnalysis.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507631440000,"displayCreateTime":"2017-10-10 18:30:40","icon":"shezhi","id":82,"parentId":1,"resClass":"setli","resCode":"setting","resName":"设置","resType":1,"resUrl":"","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507631450000,"displayCreateTime":"2017-10-10 18:30:50","icon":"","id":83,"parentId":82,"resClass":"systemSet","resCode":"sysSetting","resName":"系统设置","resType":2,"resUrl":"/view/setting/setting.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507631752000,"displayCreateTime":"2017-10-10 18:35:52","icon":"","id":84,"parentId":82,"resClass":"departSet","resCode":"depart","resName":"部门/职位管理","resType":2,"resUrl":"/view/setting/partialmanagement/partialmanagement.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507632773000,"displayCreateTime":"2017-10-10 18:52:53","icon":"","id":85,"parentId":82,"resClass":"roleSet","resCode":"role","resName":"角色/权限管理","resType":2,"resUrl":"/view/setting/role/role.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507699539000,"displayCreateTime":"2017-10-11 13:25:39","icon":"","id":86,"parentId":82,"resClass":"userSet","resCode":"user","resName":"用户管理","resType":2,"resUrl":"/view/setting/usermanagement/usermanagement.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1510054915000,"displayCreateTime":"2017-11-07 19:41:55","icon":"","id":87,"parentId":88,"resClass":"个人设置","resCode":"task","resName":"任务管理","resType":2,"resUrl":"","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1510056159000,"displayCreateTime":"2017-11-07 20:02:39","icon":"","id":88,"parentId":1,"resClass":"personalSetting","resCode":"personalSetting","resName":"个人设置","resType":1,"resUrl":"","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1511858680000,"displayCreateTime":"2017-11-28 16:44:40","icon":"","id":89,"parentId":82,"resClass":"","resCode":"res","resName":"菜单管理","resType":2,"resUrl":"/view/setting/menu/menu.html","status":1,"type":0,"updateTime":1513149771000}],"type":0,"upperId":163,"userName":"唐震","weixinId":""}
         * token : eyJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1MTMzMDkwNzIsInN1YiI6InRhbmd6aGVuIiwiZXhwIjoxNTEzMzEyNjcyLCJqdGkiOiIxZThlMDkzMzg5MWE0OWJhYjgyZDQwZDlmNGEzNzUxOCIsInVpZCI6MTk3LCJlIjozNjAwLCJhdWQiOiI5ZjRkNDg0NWYzNTE0MWU2YmRiZmQ2MzIxNzU0YTA0OSJ9.lLk9R0X6dd1knI_UAT0-Fac0BAwNT6CmxRnKbFIH480
         */

        private int expire;
        private ObjBean obj;
        private String token;

        public int getExpire() {
            return expire;
        }

        public void setExpire(int expire) {
            this.expire = expire;
        }

        public ObjBean getObj() {
            return obj;
        }

        public void setObj(ObjBean obj) {
            this.obj = obj;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public static class ObjBean {
            public int getSmsChannel() {
                return smsChannel;
            }

            public void setSmsChannel(int smsChannel) {
                this.smsChannel = smsChannel;
            }

            /**
             * birthday : 2017-12-12
             * companyId : 1
             * companyName : 浙江华坤道威数据科技有限公司
             * createTime : 1507700296000
             * email : tangzhen@worken.com
             * headName : 1508465236302_197.jpeg
             * headUrl : http://192.168.0.155//images/userHead/1508465236302_197.jpeg
             * id : 197
             * isAdmin : 1
             * isEmailValid : 0
             * isMobileValid : 0
             * job : 总经理
             * lastLoginTime : 1513073437000
             * loginName : tangzhen
             * mobile : 15669098696
             * qq :
             * sex : 女
             * status : 1
             * sysResList : [{"comId":1,"createTime":1506673067000,"displayCreateTime":"2017-09-29 16:17:47","icon":"shouye","id":65,"parentId":1,"resClass":"homeli","resCode":"home","resName":"首页","resType":1,"resUrl":"/view/index.html","status":1,"type":0,"updateTime":1513218974000},{"comId":1,"createTime":1506673154000,"displayCreateTime":"2017-09-29 16:19:14","icon":"kehu","id":66,"parentId":1,"resClass":"customerli","resCode":"cust","resName":"客户","resType":1,"resUrl":"","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1506673162000,"displayCreateTime":"2017-09-29 16:19:22","icon":"yingxiaoxinxi","id":67,"parentId":1,"resClass":"marketli","resCode":"touch","resName":"触达","resType":1,"resUrl":"","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507625755000,"displayCreateTime":"2017-10-10 16:55:55","icon":"","id":68,"parentId":66,"resClass":"clue","resCode":"clue","resName":"线索需求","resType":2,"resUrl":"/view/customer/workOrder/workOrder.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1506673181000,"displayCreateTime":"2017-09-29 16:19:41","icon":"","id":69,"parentId":66,"resClass":"customer","resCode":"cust","resName":"客户管理","resType":2,"resUrl":"/view/customer/customer/customer.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1506673221000,"displayCreateTime":"2017-09-29 16:20:21","icon":"","id":70,"parentId":67,"resClass":"pagetouch","resCode":"page","resName":"微页面","resType":2,"resUrl":"/view/marketing/micro/micropage.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507610643000,"displayCreateTime":"2017-10-10 12:44:03","icon":"jikediancanicon45","id":71,"parentId":1,"resClass":"analyli","resCode":"analysis","resName":"分析","resType":1,"resUrl":"","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507610674000,"displayCreateTime":"2017-10-10 12:44:34","icon":"","id":72,"parentId":71,"resClass":"pageanalysis","resCode":"pageAnaly","resName":"微页面数据","resType":2,"resUrl":"/view/marketing/micro/microdata.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1506673172000,"displayCreateTime":"2017-09-29 16:19:32","icon":"","id":73,"parentId":66,"resClass":"group","resCode":"group","resName":"群组","resType":2,"resUrl":"/view/customer/group/group.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507629759000,"displayCreateTime":"2017-10-10 18:02:39","icon":"","id":74,"parentId":67,"resClass":"smstouch","resCode":"sms","resName":"短信触达","resType":2,"resUrl":"/view/marketing/sms/smspage.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507629807000,"displayCreateTime":"2017-10-10 18:03:27","icon":"","id":75,"parentId":67,"resClass":"emailtouch","resCode":"email","resName":"邮件触达","resType":2,"resUrl":"/view/marketing/email/email.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507629936000,"displayCreateTime":"2017-10-10 18:05:36","icon":"","id":76,"parentId":67,"resClass":"wechatGrouptouch","resCode":"wechatGroup","resName":"微信群触达","resType":2,"resUrl":"/view/marketing/wechat/wechatgroup.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507630224000,"displayCreateTime":"2017-10-10 18:10:24","icon":"","id":77,"parentId":67,"resClass":"calltouch","resCode":"call","resName":"电话触达","resType":2,"resUrl":"/view/marketing/call/callMarketList.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507630300000,"displayCreateTime":"2017-10-10 18:11:40","icon":"","id":78,"parentId":67,"resClass":"flashtouch","resCode":"flash","resName":"弹信触达","resType":2,"resUrl":"/view/marketing/FlashSMS/list.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507631335000,"displayCreateTime":"2017-10-10 18:28:55","icon":"","id":79,"parentId":71,"resClass":"smsanalysis","resCode":"smsAnaly","resName":"短信数据","resType":2,"resUrl":"/view/marketing/sms/smsdata.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507631365000,"displayCreateTime":"2017-10-10 18:29:25","icon":"","id":80,"parentId":71,"resClass":"emailanalysis","resCode":"emailAnaly","resName":"邮件数据","resType":2,"resUrl":"/view/marketing/email/emaildata.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507631397000,"displayCreateTime":"2017-10-10 18:29:57","icon":"","id":81,"parentId":71,"resClass":"custGroupanalysis","resCode":"custGroup","resName":"客群分析","resType":2,"resUrl":"/view/Analysis/custAnalysis.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507631440000,"displayCreateTime":"2017-10-10 18:30:40","icon":"shezhi","id":82,"parentId":1,"resClass":"setli","resCode":"setting","resName":"设置","resType":1,"resUrl":"","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507631450000,"displayCreateTime":"2017-10-10 18:30:50","icon":"","id":83,"parentId":82,"resClass":"systemSet","resCode":"sysSetting","resName":"系统设置","resType":2,"resUrl":"/view/setting/setting.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507631752000,"displayCreateTime":"2017-10-10 18:35:52","icon":"","id":84,"parentId":82,"resClass":"departSet","resCode":"depart","resName":"部门/职位管理","resType":2,"resUrl":"/view/setting/partialmanagement/partialmanagement.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507632773000,"displayCreateTime":"2017-10-10 18:52:53","icon":"","id":85,"parentId":82,"resClass":"roleSet","resCode":"role","resName":"角色/权限管理","resType":2,"resUrl":"/view/setting/role/role.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1507699539000,"displayCreateTime":"2017-10-11 13:25:39","icon":"","id":86,"parentId":82,"resClass":"userSet","resCode":"user","resName":"用户管理","resType":2,"resUrl":"/view/setting/usermanagement/usermanagement.html","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1510054915000,"displayCreateTime":"2017-11-07 19:41:55","icon":"","id":87,"parentId":88,"resClass":"个人设置","resCode":"task","resName":"任务管理","resType":2,"resUrl":"","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1510056159000,"displayCreateTime":"2017-11-07 20:02:39","icon":"","id":88,"parentId":1,"resClass":"personalSetting","resCode":"personalSetting","resName":"个人设置","resType":1,"resUrl":"","status":1,"type":0,"updateTime":1513149771000},{"comId":1,"createTime":1511858680000,"displayCreateTime":"2017-11-28 16:44:40","icon":"","id":89,"parentId":82,"resClass":"","resCode":"res","resName":"菜单管理","resType":2,"resUrl":"/view/setting/menu/menu.html","status":1,"type":0,"updateTime":1513149771000}]
             * type : 0
             * upperId : 163
             * userName : 唐震
             * weixinId :
             */

            private int smsChannel;
            private String birthday;
            private int companyId;
            private String companyName;
            private long createTime;
            private String email;
            private String headName;
            private String headUrl;
            private int id;
            private int isAdmin;
            private int isEmailValid;
            private int isMobileValid;
            private String job;
            private long lastLoginTime;
            private String loginName;
            private String mobile;
            private String qq;
            private String sex;
            private int status;
            private int type;
            private int upperId;
            private String userName;
            private String weixinId;
            private int isAgreeDisclaimer;
            private List<SysResListBean> sysResList;

            public int getIsAgreeDisclaimer() {
                return isAgreeDisclaimer;
            }

            public void setIsAgreeDisclaimer(int isAgreeDisclaimer) {
                this.isAgreeDisclaimer = isAgreeDisclaimer;
            }

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }

            public int getCompanyId() {
                return companyId;
            }

            public void setCompanyId(int companyId) {
                this.companyId = companyId;
            }

            public String getCompanyName() {
                return companyName;
            }

            public void setCompanyName(String companyName) {
                this.companyName = companyName;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getHeadName() {
                return headName;
            }

            public void setHeadName(String headName) {
                this.headName = headName;
            }

            public String getHeadUrl() {
                return headUrl;
            }

            public void setHeadUrl(String headUrl) {
                this.headUrl = headUrl;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getIsAdmin() {
                return isAdmin;
            }

            public void setIsAdmin(int isAdmin) {
                this.isAdmin = isAdmin;
            }

            public int getIsEmailValid() {
                return isEmailValid;
            }

            public void setIsEmailValid(int isEmailValid) {
                this.isEmailValid = isEmailValid;
            }

            public int getIsMobileValid() {
                return isMobileValid;
            }

            public void setIsMobileValid(int isMobileValid) {
                this.isMobileValid = isMobileValid;
            }

            public String getJob() {
                return job;
            }

            public void setJob(String job) {
                this.job = job;
            }

            public long getLastLoginTime() {
                return lastLoginTime;
            }

            public void setLastLoginTime(long lastLoginTime) {
                this.lastLoginTime = lastLoginTime;
            }

            public String getLoginName() {
                return loginName;
            }

            public void setLoginName(String loginName) {
                this.loginName = loginName;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getQq() {
                return qq;
            }

            public void setQq(String qq) {
                this.qq = qq;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUpperId() {
                return upperId;
            }

            public void setUpperId(int upperId) {
                this.upperId = upperId;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public String getWeixinId() {
                return weixinId;
            }

            public void setWeixinId(String weixinId) {
                this.weixinId = weixinId;
            }

            public List<SysResListBean> getSysResList() {
                return sysResList;
            }

            public void setSysResList(List<SysResListBean> sysResList) {
                this.sysResList = sysResList;
            }

            public static class SysResListBean implements Serializable {
                /**
                 * comId : 1
                 * createTime : 1506673067000
                 * displayCreateTime : 2017-09-29 16:17:47
                 * icon : shouye
                 * id : 65
                 * parentId : 1
                 * resClass : homeli
                 * resCode : home
                 * resName : 首页
                 * resType : 1
                 * resUrl : /view/index.html
                 * status : 1
                 * type : 0
                 * updateTime : 1513218974000
                 */

                private int comId;
                private long createTime;
                private String displayCreateTime;
                private String icon;
                private int id;
                private int parentId;
                private String resClass;
                private String resCode;
                private String resName;
                private int resType;
                private String resUrl;
                private int status;
                private int type;
                private long updateTime;

                public int getComId() {
                    return comId;
                }

                public void setComId(int comId) {
                    this.comId = comId;
                }

                public long getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(long createTime) {
                    this.createTime = createTime;
                }

                public String getDisplayCreateTime() {
                    return displayCreateTime;
                }

                public void setDisplayCreateTime(String displayCreateTime) {
                    this.displayCreateTime = displayCreateTime;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getParentId() {
                    return parentId;
                }

                public void setParentId(int parentId) {
                    this.parentId = parentId;
                }

                public String getResClass() {
                    return resClass;
                }

                public void setResClass(String resClass) {
                    this.resClass = resClass;
                }

                public String getResCode() {
                    return resCode;
                }

                public void setResCode(String resCode) {
                    this.resCode = resCode;
                }

                public String getResName() {
                    return resName;
                }

                public void setResName(String resName) {
                    this.resName = resName;
                }

                public int getResType() {
                    return resType;
                }

                public void setResType(int resType) {
                    this.resType = resType;
                }

                public String getResUrl() {
                    return resUrl;
                }

                public void setResUrl(String resUrl) {
                    this.resUrl = resUrl;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public long getUpdateTime() {
                    return updateTime;
                }

                public void setUpdateTime(long updateTime) {
                    this.updateTime = updateTime;
                }
            }
        }

}
