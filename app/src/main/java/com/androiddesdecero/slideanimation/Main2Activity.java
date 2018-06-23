package com.androiddesdecero.slideanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public void onBackPressed(){
        finish();
        overridePendingTransition(R.anim.slide_right_to_left_enter, R.anim.slide_right_to_left_exit);
    }
}
