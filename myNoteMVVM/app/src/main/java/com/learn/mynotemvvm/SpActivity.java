package com.learn.mynotemvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

public class SpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp);
        Handler handler=new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        },delayMillis:3000);
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                startActivity(
//
//                );
//            }
//        }, delayMillis:3000);
    }
}