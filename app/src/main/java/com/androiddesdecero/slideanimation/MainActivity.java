package com.androiddesdecero.slideanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btMainActivity = findViewById(R.id.btMainActivity);
        btMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Main2Activity.class));
                overridePendingTransition(R.anim.slide_righttop_to_leftbottom_enter, R.anim.slide_righttop_to_leftbottom_exit);
            }
        });
    }
}
