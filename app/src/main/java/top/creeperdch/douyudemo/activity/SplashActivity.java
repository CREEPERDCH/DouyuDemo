package top.creeperdch.douyudemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;

import top.creeperdch.douyudemo.R;


public class SplashActivity extends BaseActivity {

    private RelativeLayout mLogo;
    private AlphaAnimation mAlphaAnimation;
    private AlphaAnimation mAlphaAnimation1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
        initAnim();
    }


    @Override
    protected void initView() {
        mLogo = findViewById(R.id.logo_rl);
    }

    private void initAnim() {
        //淡入
        mAlphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        mAlphaAnimation.setDuration(3000);
        mAlphaAnimation.setFillAfter(true);
        mLogo.setAnimation(mAlphaAnimation);
        //淡出
        mAlphaAnimation1 = new AlphaAnimation(1.0f, 0.0f);
        mAlphaAnimation1.setDuration(2000);
        mAlphaAnimation1.setFillAfter(true);
        mAlphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                mLogo.setAnimation(mAlphaAnimation1);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        mAlphaAnimation1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    // 启动页全屏处理
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }
}
