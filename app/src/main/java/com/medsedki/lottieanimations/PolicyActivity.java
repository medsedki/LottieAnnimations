package com.medsedki.lottieanimations;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PolicyActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btn3_back)
    Button mBtnBack;
    @BindView(R.id.btn4_next)
    Button mBtnNext;
    @BindView(R.id.check_done)
    LottieAnimationView mCheck;
    @BindView(R.id.switch_btn)
    LottieAnimationView mSwitch;

    Boolean isChecked = false;
    Boolean isClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policy);

        ButterKnife.bind(this);

        mBtnBack.setOnClickListener(this);
        mBtnNext.setOnClickListener(this);
        mBtnNext.setText("Finish");
        mCheck.setOnClickListener(this);
        mSwitch.setOnClickListener(this);
        //mSwitch.setSpeed(3f);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn3_back:
                onBackPressed();
                break;

            case R.id.btn4_next:
                finishAffinity();
                System.exit(0);
                break;

            case R.id.check_done:
                if (isChecked) {
                    mCheck.setSpeed(-3);
                    mCheck.playAnimation();
                    isChecked = false;

                } else {
                    mCheck.setSpeed(3);
                    mCheck.playAnimation();
                    isChecked = true;
                }
                break;

            case R.id.switch_btn:
                if (isClicked) {
                    //mSwitch.setMinAndMaxProgress(0.5f, 1.0f);
                    mSwitch.setSpeed(-1);
                    mSwitch.playAnimation();
                    isClicked = false;

                } else {
                    //mSwitch.setMinAndMaxProgress(0.0f, 0.5f);
                    mSwitch.setSpeed(1);
                    mSwitch.playAnimation();
                    isClicked = true;
                }
                break;
        }

    }
}
