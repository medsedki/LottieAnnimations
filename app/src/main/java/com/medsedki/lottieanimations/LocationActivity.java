package com.medsedki.lottieanimations;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LocationActivity extends AppCompatActivity implements View.OnClickListener {


    @BindView(R.id.btn2_back)
    Button mBtnBack;
    @BindView(R.id.btn3_next)
    Button mBtnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        ButterKnife.bind(this);

        mBtnBack.setOnClickListener(this);
        mBtnNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent myIntent;

        switch (v.getId()) {

            case R.id.btn2_back:

                onBackPressed();

                break;

            case R.id.btn3_next:

                myIntent = new Intent(this, PolicyActivity.class);
                startActivity(myIntent);

                break;
        }

    }
}
