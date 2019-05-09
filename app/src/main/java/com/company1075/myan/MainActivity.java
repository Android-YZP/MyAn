package com.company1075.myan;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private Button button2;
    private Button button3;
    private AnimationSet setAnimation;
    private ValueAnimator valueAnimator;
    private AnimatorSet set;
    private RelativeLayout relativeLayout;
    AnimUtil instance = AnimUtil.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv);
        relativeLayout = findViewById(R.id.rl_root_view);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        Typeface typeFace = Typeface.createFromAsset(getAssets(), "08华康娃娃体W5.TTF");
        textView.setTypeface(typeFace);

        instance.playRoot(relativeLayout);
        instance.setListener(textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showLrc("这是第二句歌词");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showLrc2("这是第三句歌词");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LrcWallActivity.class));
            }
        });


//        // 组合动画设置
//        setAnimation = new AnimationSet(true);
//        // 步骤1:创建组合动画对象(设置为true)
//        // 步骤2:设置组合动画的属性
//        // 特别说明以下情况
//        // 因为在下面的旋转动画设置了无限循环(RepeatCount = INFINITE)
//        // 所以动画不会结束，而是无限循环
//        // 所以组合动画的下面两行设置是无效的
//        setAnimation.setRepeatMode(Animation.RESTART);
//        setAnimation.setRepeatCount(100);// 设置了循环一次,但无效
//        setAnimation.setDuration(2000);
//        setAnimation.setRepeatMode(Animation.RESTART);
//        setAnimation.setRepeatCount(Animation.INFINITE);
//        // 步骤3:逐个创建子动画(方式同单个动画创建方式,此处不作过多描述)
//        // 子动画1:旋转动画
//        Animation rotate = new RotateAnimation(10, 0
//                , Animation.RELATIVE_TO_SELF, 0.5f
//                , Animation.RELATIVE_TO_SELF, 0.5f);
//        rotate.setDuration(1000);
//
//        Animation rotate2 = new RotateAnimation(0, 10
//                , Animation.RELATIVE_TO_SELF, 0.5f
//                , Animation.RELATIVE_TO_SELF, 0.5f);
//        rotate2.setDuration(1000);
//        rotate2.setStartOffset(1000);
//
//        // 子动画2:平移动画
////        Animation translate = new TranslateAnimation(TranslateAnimation.RELATIVE_TO_PARENT, -0.5f,
////                TranslateAnimation.RELATIVE_TO_PARENT, 0.5f,
////                TranslateAnimation.RELATIVE_TO_SELF, 0f
////                , TranslateAnimation.RELATIVE_TO_SELF, 0f);
////        translate.setDuration(5000);
//
////        // 子动画3:透明度动画
////        Animation alpha = new AlphaAnimation(1, 0);
////        alpha.setDuration(3000);
////        alpha.setStartOffset(1000);
//
//        // 子动画4:缩放动画
////        Animation scale1 = new ScaleAnimation(1,0.5f,1,0.5f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
////        scale1.setDuration(1000);
////        scale1.setStartOffset(4000);
//
//        // 步骤4:将创建的子动画添加到组合动画里
////        setAnimation.addAnimation(alpha);
//        setAnimation.addAnimation(rotate);
////        setAnimation.addAnimation(translate);
////        setAnimation.addAnimation(scale1);
//        setAnimation.addAnimation(rotate2);
//        Interpolator overshootInterpolator = new DecelerateInterpolator();
//        // 步骤3：创建对应的插值器类对象
//
//        setAnimation.setInterpolator(overshootInterpolator);
//        // 步骤4：给动画设置插值器
////        textView.startAnimation(setAnimation);
//        // 步骤5:播放动画

//        // 创建动画作用对象：此处以Button为例
//
//// 步骤1：设置属性数值的初始值 & 结束值
//        valueAnimator = ValueAnimator.ofInt(textView.getLayoutParams().width, 500);
//        // 初始值 = 当前按钮的宽度，此处在xml文件中设置为150
//        // 结束值 = 500
//        // ValueAnimator.ofInt()内置了整型估值器,直接采用默认的.不需要设置
//        // 即默认设置了如何从初始值150 过渡到 结束值500
//
//// 步骤2：设置动画的播放各种属性
//        valueAnimator.setDuration(2000);
//        // 设置动画运行时长:1s
//
//// 步骤3：将属性数值手动赋值给对象的属性:此处是将 值 赋给 按钮的宽度
//        // 设置更新监听器：即数值每次变化更新都会调用该方法
//        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animator) {
//
//                int currentValue = (Integer) animator.getAnimatedValue();
//                // 获得每次变化后的属性值
//                System.out.println(currentValue);
//                // 输出每次变化后的属性值进行查看
//
//                textView.getLayoutParams().width = currentValue;
//                // 每次值变化时，将值手动赋值给对象的属性
//                // 即将每次变化后的值 赋 给按钮的宽度，这样就实现了按钮宽度属性的动态变化
//
//// 步骤4：刷新视图，即重新绘制，从而实现动画效果
//                textView.requestLayout();
//
//            }
//        });
//
//        valueAnimator.start();
        // 启动动画
    }

    private void showLrc(final String lrc) {
        instance.randomAnim(AnimUtil.SongAnimType1, false, textView, relativeLayout);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setText(lrc);
                instance.randomAnim(AnimUtil.SongAnimType1, true, textView, relativeLayout);
            }
        }, 1000);
    }

    private void showLrc2(final String lrc) {
        instance.randomAnim(AnimUtil.SongAnimType2, false, textView, relativeLayout);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setText(lrc);
                instance.randomAnim(AnimUtil.SongAnimType2, true, textView, relativeLayout);
            }
        }, 1000);
    }
}






















