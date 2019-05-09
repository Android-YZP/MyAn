package com.company1075.myan;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

class AnimUtil {
    private AnimatorSet set;
    public static int SongAnimType1 = 0;
    public static int SongAnimType2 = 1;
    public static int SongAnimType3 = 2;
    Random r = new Random();
    AnimatorSet set2 = new AnimatorSet();


//    OnAnimEndListener onAnimEndListener ;
//
//    public void setOnAnimEndListener(OnAnimEndListener onAnimEndListener) {
//        this.onAnimEndListener = onAnimEndListener;
//    }
//
//    public interface OnAnimEndListener {
//        void onEnd();
//    }


    private final static AnimUtil INSTANCE = new AnimUtil();

    private AnimUtil() {
    }

    public static AnimUtil getInstance() {

        return INSTANCE;
    }

    /**
     * 背景图微动
     */
    public void playRoot(RelativeLayout relativeLayout) {
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(relativeLayout, "translationX", 0f, 40f);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(relativeLayout, "translationY", 0f, 40f);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(relativeLayout, "translationX", 0f, -20f);
        ObjectAnimator animator4 = ObjectAnimator.ofFloat(relativeLayout, "translationY", 0f, -20f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(relativeLayout, "scaleX", 1f, 1.1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(relativeLayout, "scaleY", 1f, 1.1f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(relativeLayout, "scaleX", 1.1f, 1f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(relativeLayout, "scaleY", 1.1f, 1f);
        ObjectAnimator animator9 = ObjectAnimator.ofFloat(relativeLayout, "translationX", 40f, 0f);
        ObjectAnimator animator10 = ObjectAnimator.ofFloat(relativeLayout, "translationY", 40f, 0f);
        ObjectAnimator animator11 = ObjectAnimator.ofFloat(relativeLayout, "translationX", -20f, 0f);
        ObjectAnimator animator12 = ObjectAnimator.ofFloat(relativeLayout, "translationY", -20f, 0f);

        ObjectAnimator animator13 = ObjectAnimator.ofFloat(relativeLayout, "rotation", -5f, 5f, -5f);
        set = new AnimatorSet();

        set.setDuration(6000);
//        set.playSequentially(animator1,animator2,animator3,animator4,animator5,animator6);
        set.play(animator1).with(animator2).before(animator3).with(animator4).with(animator5).with(animator6).with(animator13)
                .before(animator11).before(animator8).before(animator9).before(animator10).before(animator7).before(animator12);
        set.start();
        set.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                set.start();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }

    /**
     */
    void lrcIn(TextView textView) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(textView, "translationY", 80f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(textView, "scaleX", 0.5f, 1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(textView, "scaleY", 0.5f, 1.2f, 1f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(textView, "alpha", 0f, 1f);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator5, animator6, animator7);
        set2.start();
        set2.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

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
    }

    /**
     */
    void lrcIn2(TextView textView) {
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(textView, "translationY", 10f, 0f, 10f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(textView, "scaleX", 0.8f, 1.2f, 1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(textView, "scaleY", 0.1f, 1.2f, 1f);
        set2 = new AnimatorSet();
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(textView, "alpha", 0f, 1f);
        set2.setDuration(1500);
        set2.playTogether(animator2, animator5, animator6, animator7);
        set2.start();
    }

    /**
     */
    void lrcIn3(TextView textView) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(textView, "translationY", 10f, 0f, 10f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(textView, "scaleX", 3f, 1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(textView, "scaleY", 3f, 1f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(textView, "alpha", 0f, 1f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(textView, "rotation", 0f, -10f);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator5, animator6, animator7, animator8);
        set2.start();
    }

    void lrcIn4(TextView textView) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(textView, "translationX", -20f, 20f, 0f);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(textView, "translationY", 20f, -20f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(textView, "scaleX", 0.4f, 1.2f, 1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(textView, "scaleY", 0.4f, 1.2f, 1f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(textView, "alpha", 0f, 1f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(textView, "rotation", 0f, 6f);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator3, animator5, animator6, animator7, animator8);
        set2.start();
    }

    void lrcIn5(TextView textView) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(textView, "translationX", -300f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(textView, "scaleX", 0f, 1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(textView, "scaleY", 0.7f, 1f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(textView, "alpha", 0f, 1f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(textView, "rotation", 0f, 10f);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator5, animator6, animator7, animator8);
        set2.start();
    }

    void lrcOut(TextView textView) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(textView, "translationX", 0f, 300f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(textView, "scaleX", 1f, 1.5f, 1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(textView, "scaleY", 1f, 1.5f, 1f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(textView, "alpha", 1f, 0f, 0f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(textView, "rotation", 0f, 10f);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator5, animator6, animator7, animator8);
        set2.start();
    }

    void lrcOut2(TextView textView) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(textView, "translationX", 0f, -300f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(textView, "scaleX", 1f, 1.5f, 1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(textView, "scaleY", 1f, 1.5f, 1f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(textView, "alpha", 1f, 0f, 0f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(textView, "rotation", 0f, 10f);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator5, animator6, animator7, animator8);
        set2.start();
    }

    void lrcOut3(TextView textView) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(textView, "translationX", 0f, 300f, 0f);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(textView, "translationY", 0f, 300f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(textView, "scaleX", 1f, 1.5f, 1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(textView, "scaleY", 1f, 1.5f, 1f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(textView, "alpha", 1f, 0f, 0f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(textView, "rotation", 0f, 10f);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator3, animator5, animator6, animator7, animator8);
        set2.start();
    }

    void lrcOut4(TextView textView) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(textView, "translationY", 0f, 300f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(textView, "scaleX", 1f, 1.5f, 1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(textView, "scaleY", 1f, 1.5f, 1f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(textView, "alpha", 1f, 0f, 0f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(textView, "rotation", 0f, 10f);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator5, animator6, animator7, animator8);
        set2.start();
    }

    void lrcOut6(TextView textView) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(textView, "translationY", 0f, -300f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(textView, "scaleX", 1f, 1.5f, 1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(textView, "scaleY", 1f, 1.5f, 1f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(textView, "alpha", 1f, 0f, 0f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(textView, "rotation", 0f, 10f);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator5, animator6, animator7, animator8);
        set2.start();
    }

    void lrcOut5(TextView textView) {

        ObjectAnimator animator5 = ObjectAnimator.ofFloat(textView, "scaleX", 1f, 1.5f, 1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(textView, "scaleY", 1f, 1.5f, 1f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(textView, "alpha", 1f, 0f, 0f);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator5, animator6, animator7);
        set2.start();
    }
    /********************************************************第二种**************************************************************************/


    /**
     */
    void lrcIn(RelativeLayout relativeLayout) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(relativeLayout, "translationY", 400f, 0f);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(relativeLayout, "translationX", 200f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(relativeLayout, "scaleX", 0.7f, 1.2f, 1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(relativeLayout, "scaleY", 0.7f, 1f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(relativeLayout, "alpha", 0f, 1f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(relativeLayout, "rotation", 0f, -10f);
        set2 = new AnimatorSet();

        set2.setDuration(1500);
        set2.playTogether(animator2, animator3, animator5, animator6, animator7, animator8);
        set2.start();
    }

    /**
     */
    void lrcIn2(RelativeLayout relativeLayout) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(relativeLayout, "translationY", -400f, 0f);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(relativeLayout, "translationX", 200f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(relativeLayout, "scaleX", 0.7f, 1.2f, 1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(relativeLayout, "scaleY", 0.7f, 1f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(relativeLayout, "alpha", 0f, 1f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(relativeLayout, "rotation", 0f, -10f);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator3, animator5, animator6, animator7, animator8);
        set2.start();
    }

    /**
     */
    void lrcIn3(RelativeLayout relativeLayout) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(relativeLayout, "translationY", 400f, 0f);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(relativeLayout, "translationX", -200f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(relativeLayout, "scaleX", 0.7f, 1.2f, 1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(relativeLayout, "scaleY", 0.7f, 1f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(relativeLayout, "alpha", 0f, 1f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(relativeLayout, "rotation", 0f, -10f);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator3, animator5, animator6, animator7, animator8);
        set2.start();
    }

    /**
     */
    void lrcIn4(RelativeLayout relativeLayout) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(relativeLayout, "translationY", -400f, 0f);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(relativeLayout, "translationX", -200f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(relativeLayout, "scaleX", 0.7f, 1.2f, 1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(relativeLayout, "scaleY", 0.7f, 1f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(relativeLayout, "alpha", 0f, 1f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(relativeLayout, "rotation", 0f, -10f);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator3, animator5, animator6, animator7, animator8);
        set2.start();
    }

    /**
     */
    void lrcIn5(RelativeLayout relativeLayout) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(relativeLayout, "translationY", 200f, 0f);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(relativeLayout, "translationX", 400f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(relativeLayout, "scaleX", 0.7f, 1.2f, 1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(relativeLayout, "scaleY", 0.7f, 1f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(relativeLayout, "alpha", 0f, 1f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(relativeLayout, "rotation", 0f, -10f);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator3, animator5, animator6, animator7, animator8);
        set2.start();
    }

    /**
     */
    void lrcIn6(RelativeLayout relativeLayout) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(relativeLayout, "translationY", 400f, 0f);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(relativeLayout, "translationX", 400f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(relativeLayout, "scaleX", 0.7f, 1.2f, 1f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(relativeLayout, "scaleY", 0.7f, 1f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(relativeLayout, "alpha", 0f, 1f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(relativeLayout, "rotation", 0f, -10f);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator3, animator5, animator6, animator7, animator8);
        set2.start();
    }

    /**
     */
    void lrcOut(RelativeLayout relativeLayout) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(relativeLayout, "translationY", 0f, 400f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(relativeLayout, "scaleX", 1f, 0.4f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(relativeLayout, "scaleY", 1f, 0.4f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(relativeLayout, "alpha", 1f, 0f, 0f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(relativeLayout, "rotation", 0f, -10f, 0);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator5, animator6, animator7, animator8);
        set2.start();
    }

    /**
     */
    void lrcOut2(RelativeLayout relativeLayout) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(relativeLayout, "translationY", 0f, -400f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(relativeLayout, "scaleX", 1f, 0.4f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(relativeLayout, "scaleY", 1f, 0.4f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(relativeLayout, "alpha", 1f, 0f, 0f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(relativeLayout, "rotation", 0f, -10f, 0);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator5, animator6, animator7, animator8);
        set2.start();
    }

    /**
     */
    void lrcOut3(RelativeLayout relativeLayout) {

        ObjectAnimator animator3 = ObjectAnimator.ofFloat(relativeLayout, "translationX", 0f, -400f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(relativeLayout, "scaleX", 1f, 0.4f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(relativeLayout, "scaleY", 1f, 0.4f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(relativeLayout, "alpha", 1f, 0f, 0f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(relativeLayout, "rotation", 0f, 10f, 0);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator3, animator5, animator6, animator7, animator8);
        set2.start();
    }

    /**
     */
    void lrcOut4(RelativeLayout relativeLayout) {

        ObjectAnimator animator3 = ObjectAnimator.ofFloat(relativeLayout, "translationX", 0f, 400f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(relativeLayout, "scaleX", 1f, 0.4f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(relativeLayout, "scaleY", 1f, 0.4f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(relativeLayout, "alpha", 1f, 0f, 0f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(relativeLayout, "rotation", 0f, -10f, 0);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator3, animator5, animator6, animator7, animator8);
        set2.start();
    }

    /**
     */
    void lrcOut5(RelativeLayout relativeLayout) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(relativeLayout, "translationY", 0f, 400f, 0f);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(relativeLayout, "translationX", 0f, 400f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(relativeLayout, "scaleX", 1f, 0.4f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(relativeLayout, "scaleY", 1f, 0.4f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(relativeLayout, "alpha", 1f, 0f, 0f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(relativeLayout, "rotation", 0f, 10f, 0);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator3, animator5, animator6, animator7, animator8);
        set2.start();
    }

    /**
     */
    void lrcOut6(RelativeLayout relativeLayout) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(relativeLayout, "translationY", 0f, -400f, 0f);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(relativeLayout, "translationX", 0f, 400f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(relativeLayout, "scaleX", 1f, 0.4f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(relativeLayout, "scaleY", 1f, 0.4f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(relativeLayout, "alpha", 1f, 0f, 0f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(relativeLayout, "rotation", 0f, -10f, 0);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator3, animator5, animator6, animator7, animator8);
        set2.start();
    }

    /**
     */
    void lrcOut7(RelativeLayout relativeLayout) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(relativeLayout, "translationY", 0f, -400f, 0f);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(relativeLayout, "translationX", 0f, -400f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(relativeLayout, "scaleX", 1f, 0.4f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(relativeLayout, "scaleY", 1f, 0.4f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(relativeLayout, "alpha", 1f, 0f, 0f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(relativeLayout, "rotation", 0f, 10f, 0);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator3, animator5, animator6, animator7, animator8);
        set2.start();
    }

    /**
     */
    void lrcOut8(RelativeLayout relativeLayout) {

        ObjectAnimator animator2 = ObjectAnimator.ofFloat(relativeLayout, "translationY", 0f, 400f, 0f);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(relativeLayout, "translationX", 0f, -400f, 0f);
        ObjectAnimator animator5 = ObjectAnimator.ofFloat(relativeLayout, "scaleX", 1f, 0.4f);
        ObjectAnimator animator6 = ObjectAnimator.ofFloat(relativeLayout, "scaleY", 1f, 0.4f);
        ObjectAnimator animator7 = ObjectAnimator.ofFloat(relativeLayout, "alpha", 1f, 0f, 0f);
        ObjectAnimator animator8 = ObjectAnimator.ofFloat(relativeLayout, "rotation", 0f, -10f, 0);
        set2 = new AnimatorSet();
        set2.setDuration(1500);
        set2.playTogether(animator2, animator3, animator5, animator6, animator7, animator8);
        set2.start();
    }

    /**
     * @param songType       整首歌的动画风格
     * @param isLrcIn        true:歌词进入,false:歌词退出
     * @param textView       歌词控件
     * @param relativeLayout 歌词背景控件
     */
    public void randomAnim(int songType, boolean isLrcIn, TextView textView, RelativeLayout relativeLayout) {
        set2.cancel();
        if (songType == 0) {
            if (isLrcIn) {
                randomAnimInType1(textView);
            } else {
                randomAnimOutType1(textView);
            }


        } else if (songType == 1) {

            if (isLrcIn) {
                randomAnimInType2(relativeLayout);
            } else {
                randomAnimOutType2(relativeLayout);
            }

        } else if (songType == 2) {
            if (isLrcIn) {
                randomAnimInType3();
            } else {
                randomAnimOutType3();
            }

        }
    }

    public void setListener(final TextView textView) {
        set2.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                Log.e("+++++++++++++++++", "onAnimationStart");
                setLayout(textView);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                Log.e("+++++++++++++++++", "onAnimationEnd");
                setLayout(textView);
            }

            @Override
            public void onAnimationCancel(Animator animation) {
                Log.e("+++++++++++++++++", "onAnimationCancel");
                setLayout(textView);
            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                Log.e("+++++++++++++++++", "onAnimationRepeat");
                setLayout(textView);
            }
        });
    }

    public void setLayout(View view) {
        view.setX(0);
        view.setY(0);
        view.requestLayout();
    }

    private void randomAnimOutType1(TextView textView) {
        switch (r.nextInt(6)) {
            case 0:
                lrcOut(textView);
                break;
            case 1:
                lrcOut2(textView);
                break;
            case 2:
                lrcOut3(textView);
                break;
            case 3:
                lrcOut4(textView);
                break;
            case 4:
                lrcOut5(textView);
                break;
            case 5:
                lrcOut6(textView);
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            default:
                break;
        }

    }

    private void randomAnimInType1(TextView textView) {
        switch (r.nextInt(5)) {
            case 0:
                lrcIn(textView);
                break;
            case 1:
                lrcIn2(textView);
                break;
            case 2:
                lrcIn3(textView);
                break;
            case 3:
                lrcIn4(textView);
                break;
            case 4:
                lrcIn5(textView);
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            default:
                break;
        }
    }

    private void randomAnimOutType2(RelativeLayout relativeLayout) {
        switch (r.nextInt(8)) {
            case 0:
                lrcOut2(relativeLayout);
                break;
            case 1:
                lrcOut3(relativeLayout);
                break;
            case 2:
                lrcOut4(relativeLayout);
                break;
            case 3:
                lrcOut5(relativeLayout);
                break;
            case 4:
                lrcOut6(relativeLayout);
                break;
            case 5:
                lrcOut7(relativeLayout);
                break;
            case 6:
                lrcOut8(relativeLayout);
                break;
            case 7:
                lrcOut(relativeLayout);
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            default:
                break;
        }
    }

    private void randomAnimInType2(RelativeLayout relativeLayout) {

        switch (r.nextInt(6)) {
            case 0:
                lrcIn(relativeLayout);
                break;
            case 1:
                lrcIn2(relativeLayout);
                break;
            case 2:
                lrcIn3(relativeLayout);
                break;
            case 3:
                lrcIn4(relativeLayout);
                break;
            case 4:
                lrcIn5(relativeLayout);
                break;
            case 5:
                lrcIn6(relativeLayout);
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            default:
                break;
        }
    }

    private void randomAnimOutType3() {

    }

    private void randomAnimInType3() {

    }


}
