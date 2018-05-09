package com.example.customermodel.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.basemodel.utils.CommonUtils;
import com.example.customermodel.R;

public class CustomerDetailActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tv_cotent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_detail);
        tv_cotent= (TextView) findViewById(R.id.tv_cotent);
        tv_cotent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.tv_cotent) {
            CommonUtils.showToast(this,"客户详情");
        } else {
        }
    }
}
