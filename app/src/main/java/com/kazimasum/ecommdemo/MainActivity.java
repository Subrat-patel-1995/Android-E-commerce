package com.kazimasum.ecommdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        tv=(TextView)findViewById(R.id.login_tv);
            tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                      startActivity(new Intent(getApplicationContext(),register.class));
                      finish();
                    }
                });
    }
}