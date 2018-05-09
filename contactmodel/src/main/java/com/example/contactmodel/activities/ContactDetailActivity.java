package com.example.contactmodel.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.basemodel.utils.CommonUtils;
import com.example.contactmodel.R;
import com.example.routermodel.CustomerModuleService;
import com.example.routermodel.ReflectUtils;

public class ContactDetailActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tv_contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_detail);
        tv_contact= (TextView) findViewById(R.id.tv_contact);
        tv_contact.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.tv_contact) {
            CustomerModuleService moduleCall = (CustomerModuleService) ReflectUtils.getModuleCall("com.example.customermodel.interfacesimpl.CustomerModuleServiceImpl");
            if (moduleCall != null) {
                moduleCall.initContext(this);
                moduleCall.getCustomerInfo();
            } else
                CommonUtils.showToast(this, "业务组件单独调试不应该跟其他业务Module产生交互，如果你依然想要在运行期依赖其它组件，那么请参考MainModule");


        } else {
        }
    }
}
