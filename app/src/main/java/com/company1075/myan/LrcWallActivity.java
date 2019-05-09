package com.company1075.myan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LrcWallActivity extends AppCompatActivity {

    private LrcWall1 lrcWall1;
    private LrcWall2 lrcWall2;
    private Button bt;
    private int mLrcNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lrc_wall);
        lrcWall1 = findViewById(R.id.lrc_wall);
        lrcWall2 = findViewById(R.id.lrc_wall2);
        bt = findViewById(R.id.bt);
        initData();
    }

    private void initData() {
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLrcNum++;

                if (mLrcNum <= 9) {
                    lrcWall1.setLrc("歌词添加");

                    if (mLrcNum == 1) lrcWall2.disappear2();

                    if (mLrcNum == 2) lrcWall2.disappearAll();

                } else if (mLrcNum <= 18) {
                    lrcWall2.setLrc("歌词添加");

                    if (mLrcNum == 10) lrcWall1.disappear2();

                    if (mLrcNum == 11) lrcWall1.disappearAll();

                    if (mLrcNum == 18) mLrcNum = 0;//一个循环
                }


            }
        });
    }

}
