package com.example.customermodel.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.customermodel.R;
import com.example.customermodel.activities.CustomerDetailActivity;

/**
 * Created by Administrator on 2018/4/28.
 */

public class CustomerFragment extends Fragment implements View.OnClickListener{

    private TextView tv_customer;

    private Context mContext;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext=context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_customer_layout, container, false);
        tv_customer= (TextView) view.findViewById(R.id.tv_customer);
        tv_customer.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.tv_customer) {
            //Toast.makeText(mContext,"客户",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(mContext,CustomerDetailActivity.class);
            startActivity(intent);
        }
    }
}
