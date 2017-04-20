package com.itzyf.dynamiccolordemo;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /**
     * 字体颜色变化
     */
    private Button mBtnTextChange;
    /**
     * 背景颜色变化
     */
    private Button mBtnBgChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtnTextChange = (Button) findViewById(R.id.btn_text_change);
        int[][] states = {{-android.R.attr.state_pressed}, {android.R.attr.state_pressed}}; //状态
        ColorStateList colorStateList = new ColorStateList(states, new int[]{Color.BLUE, Color.RED});
        mBtnTextChange.setTextColor(colorStateList);

        mBtnBgChange = (Button) findViewById(R.id.btn_bg_change);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-android.R.attr.state_pressed}, new ColorDrawable(Color.BLUE));
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(Color.RED));
        mBtnBgChange.setBackground(stateListDrawable);
    }

}
