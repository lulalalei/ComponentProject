package com.example.basemodel.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.basemodel.R;



/**
 * Created by wangyc 自定义底部导航条.
 */

public class BottomBar extends LinearLayout implements View.OnClickListener {


    private Context mContext;

    private ChangeListener listener;


    private int currentTab = -1;

    LinearLayout tab1;
    LinearLayout tab2;
    LinearLayout tab3;
    LinearLayout tab4;
    ImageView ivTab1;
    TextView tvTab1;
    ImageView ivTab2;
    TextView tvTab2;
    ImageView ivTab3;
    TextView tvTab3;
    ImageView ivTab4;
    TextView tvTab4;


    public BottomBar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);

    }

    public BottomBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
    }

    public BottomBar(Context context) {
        this(context, null, 0);
    }

    private void initView() {
        // View bar = View.inflate(mContext, R.layout.bottom_bar, this);

        LinearLayout bar = (LinearLayout) LayoutInflater.from(mContext).inflate(R.layout.bottom_bar, null);
        LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        addView(bar, lp);
        tab1= (LinearLayout) bar.findViewById(R.id.tab1);
        tab2= (LinearLayout) bar.findViewById(R.id.tab2);
        tab3= (LinearLayout) bar.findViewById(R.id.tab3);
        tab4= (LinearLayout) bar.findViewById(R.id.tab4);
        ivTab1= (ImageView) bar.findViewById(R.id.ivTab1);
        tvTab1= (TextView) bar.findViewById(R.id.tvTab1);
        ivTab2= (ImageView) bar.findViewById(R.id.ivTab2);
        tvTab2= (TextView) bar.findViewById(R.id.tvTab2);
        ivTab3= (ImageView) bar.findViewById(R.id.ivTab3);
        tvTab3= (TextView) bar.findViewById(R.id.tvTab3);
        ivTab4= (ImageView) bar.findViewById(R.id.ivTab4);
        tvTab4= (TextView) bar.findViewById(R.id.tvTab4);

        tab1.setOnClickListener(this);
        tab2.setOnClickListener(this);
        tab3.setOnClickListener(this);
        tab4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.tab1) {
            changeTab(0);

        } else if (i == R.id.tab2) {
            changeTab(1);

        } else if (i == R.id.tab3) {
            changeTab(2);

        }else if (i == R.id.tab4) {
            changeTab(3);

        }
    }

    private void setbottombcdefail() {
        ivTab1.setImageResource(R.drawable.tab_home_n);
        ivTab2.setImageResource(R.drawable.tab_customer_n);
        ivTab3.setImageResource(R.drawable.tab_marketing_n);
        ivTab4.setImageResource(R.drawable.tab_me_n);
        tvTab1.setTextAppearance(mContext, R.style.TextAppear_Theme_C6_Size10);
        tvTab2.setTextAppearance(mContext, R.style.TextAppear_Theme_C6_Size10);
        tvTab3.setTextAppearance(mContext, R.style.TextAppear_Theme_C6_Size10);
        tvTab4.setTextAppearance(mContext, R.style.TextAppear_Theme_C6_Size10);

    }


    public void changeTab(int tab) {
        if (currentTab != tab) {
            setbottombcdefail();
            switch (tab) {
                case 0:
                    ivTab1.setImageResource(R.drawable.tab_home_p);
                    tvTab1.setTextAppearance(mContext, R.style.TextAppear_Theme_A5_Size10);
                    break;
                case 1:
                    ivTab2.setImageResource(R.drawable.tab_customer_p);
                    tvTab2.setTextAppearance(mContext, R.style.TextAppear_Theme_A5_Size10);
                    break;
                case 2:
                    ivTab3.setImageResource(R.drawable.tab_marketing_p);
                    tvTab3.setTextAppearance(mContext, R.style.TextAppear_Theme_A5_Size10);
                    break;
                case 3:
                    ivTab4.setImageResource(R.drawable.tab_me_p);
                    tvTab4.setTextAppearance(mContext, R.style.TextAppear_Theme_A5_Size10);
                    break;
                default:
                    break;
            }
            if (listener != null) {
                listener.changeTab2(tab);
                //LogUtil.d("ttttt","=======================");
            }
            currentTab = tab;
        }
    }


    public interface ChangeListener {

        void changeTab2(int tab);

    }

    public ChangeListener getListener() {
        return listener;
    }

    public void setListener(ChangeListener listener) {
        this.listener = listener;
    }


}
