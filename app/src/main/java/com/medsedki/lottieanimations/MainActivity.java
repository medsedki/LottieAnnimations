package com.medsedki.lottieanimations;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.titre)
    TextView mTextView;

    @BindView(R.id.btn_next)
    Button mBtnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mBtnNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent myIntent;

        switch (v.getId()) {
            case R.id.btn_next:

                //Toast.makeText(this, "Next", Toast.LENGTH_SHORT).show();

                myIntent = new Intent(this, TravelActivity.class);
                startActivity(myIntent);

                break;

        }
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}
