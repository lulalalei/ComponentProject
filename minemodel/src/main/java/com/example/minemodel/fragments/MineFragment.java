package com.example.minemodel.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.minemodel.R;

/**
 * Created by Administrator on 2018/4/28.
 */

public class MineFragment extends Fragment implements View.OnClickListener{

    private TextView tv_mine;

    private Context mContext;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext=context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine_layout, container, false);
        tv_mine= (TextView) view.findViewById(R.id.tv_mine);
        tv_mine.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.tv_mine) {
            Toast.makeText(mContext,"我的",Toast.LENGTH_LONG).show();
        }
    }
}
