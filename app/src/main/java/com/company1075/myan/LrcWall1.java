package com.company1075.myan;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class LrcWall1 extends FrameLayout {

    List<String> mLrcList = new ArrayList<>();
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView7;
    private TextView textView8;
    private TextView textView9;

    public LrcWall1(Context context) {
        super(context);
        initView(context);
        initData(context);
    }


    public LrcWall1(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
        initData(context);
    }

    public LrcWall1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
        initData(context);
    }

    private void initView(Context context) {
        View view = FrameLayout.inflate(context, R.layout.lrc_wall_1, null);
        textView1 = view.findViewById(R.id.lrc_1);
        textView2 = view.findViewById(R.id.lrc_2);
        textView3 = view.findViewById(R.id.lrc_3);
        textView4 = view.findViewById(R.id.lrc_4);
        textView5 = view.findViewById(R.id.lrc_5);
        textView6 = view.findViewById(R.id.lrc_6);
        textView7 = view.findViewById(R.id.lrc_7);
        textView8 = view.findViewById(R.id.lrc_8);
        textView9 = view.findViewById(R.id.lrc_9);
        addView(view);
    }


    private void initData(Context context) {
        textViewType(context,textView1);
        textViewType(context,textView2);
        textViewType(context,textView3);
        textViewType(context,textView4);
        textViewType(context,textView5);
        textViewType(context,textView6);
        textViewType(context,textView7);
        textViewType(context,textView8);
        textViewType(context,textView9);
    }

    public void setLrc(String lrc) {
        mLrcList.add(lrc);
        if (mLrcList.size() >= 9) {
            disappear1();
        }
        showLrc();
    }


    private void showLrc() {
        if (1 == mLrcList.size()) {
            lrcIn(textView1, mLrcList.get(0));
        } else if (2 == mLrcList.size()) {
            lrcIn(textView2, mLrcList.get(1));
        } else if (3 == mLrcList.size()) {
            lrcIn(textView3, mLrcList.get(2));
        } else if (4 == mLrcList.size()) {
            lrcIn(textView4, mLrcList.get(3));
        } else if (5 == mLrcList.size()) {
            lrcIn(textView5, mLrcList.get(4));
        } else if (6 == mLrcList.size()) {
            lrcIn(textView6, mLrcList.get(5));
        } else if (7 == mLrcList.size()) {
            lrcIn(textView7, mLrcList.get(6));
        } else if (8 == mLrcList.size()) {
            lrcIn(textView8, mLrcList.get(7));
        } else if (9 == mLrcList.size()) {
            lrcIn(textView9, mLrcList.get(8));
        }
    }

    private void upDateLrc() {
        for (int i = 0; i < mLrcList.size(); i++) {
            if (i == 0) {
                textView1.setText(mLrcList.get(i));
            } else if (i == 1) {
                textView2.setText(mLrcList.get(i));
            } else if (i == 2) {
                textView3.setText(mLrcList.get(i));
            } else if (i == 3) {
                textView4.setText(mLrcList.get(i));
            } else if (i == 4) {
                textView5.setText(mLrcList.get(i));
            } else if (i == 5) {
                textView6.setText(mLrcList.get(i));
            } else if (i == 6) {
                textView7.setText(mLrcList.get(i));
            } else if (i == 7) {
                textView8.setText(mLrcList.get(i));
            } else if (i == 8) {
                textView9.setText(mLrcList.get(i));
            }
        }
    }

    /**
     *
     */
    private void textViewType(Context context, TextView textView) {
        Typeface typeFace = Typeface.createFromAsset(context.getAssets(), "08华康娃娃体W5.TTF");
        textView.setTypeface(typeFace);
    }



    private void disappear1() {
        lrcOut(textView1, 0);
        lrcOut(textView2, 1);
    }

    /**
     *
     */
    public void disappear2() {
        if (mLrcList.size() < 9) return;
        lrcOut(textView3, 2);
        lrcOut(textView6, 5);
    }

    public void disappearAll() {
        if (mLrcList.size() < 9) return;

        lrcOut(textView1, 0);
        lrcOut(textView2, 1);
        lrcOut(textView3, 2);
        lrcOut(textView4, 3);
        lrcOut(textView5, 4);
        lrcOut(textView6, 5);
        lrcOut(textView7, 6);
        lrcOut(textView8, 7);
        lrcOut(textView9, 8);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mLrcList.clear();
            }
        }, 1200);

    }


    /**
     */
    void lrcOut(TextView textView, final int position) {

        ObjectAnimator animator5 = ObjectAnimator.ofFloat(textView, "scaleX", 1f, 0f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(textView, "scaleY", 1f, 0f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(textView, "alpha", 1f, 0f);
        AnimatorSet set2 = new AnimatorSet();
        set2.setDuration(1000);
        set2.playTogether(animator5, animator6, animator7);
        set2.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                mLrcList.set(position, "");
                upDateLrc();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        set2.start();
    }

    /**
     */
    void lrcIn(final TextView textView, final String lrc) {

        ObjectAnimator animator5 = ObjectAnimator.ofFloat(textView, "scaleX", 0f, 1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(textView, "scaleY", 0f, 1f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(textView, "alpha", 0.5f, 1f);
        AnimatorSet set2 = new AnimatorSet();
        set2.setDuration(200);
        set2.playTogether(animator5, animator6, animator7);
        set2.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                textView.setText(lrc);
            }

            @Override
            public void onAnimationEnd(Animator animation) {

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        set2.start();
    }
}
