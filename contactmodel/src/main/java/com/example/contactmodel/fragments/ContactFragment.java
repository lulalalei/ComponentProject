package com.example.contactmodel.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.basemodel.bases.BaseApplication;
import com.example.contactmodel.R;
import com.example.routermodel.ReflectUtils;


/**
 * Created by Administrator on 2018/4/28.
 */

public class ContactFragment extends Fragment implements View.OnClickListener{

    private TextView tv_contact;

    private Context mContext;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext=context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact_layout, container, false);
        tv_contact= (TextView) view.findViewById(R.id.tv_contact);
        tv_contact.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.tv_contact) {
            //Toast.makeText(mContext,"触达",Toast.LENGTH_LONG).show();
            ReflectUtils.startActivityWithName(mContext,"com.example.contactmodel.activities.ContactDetailActivity");
        }
    }
}
