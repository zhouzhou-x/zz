package com.example.myapplicationysz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class FailureActivity extends AppCompatActivity {
    private final static String TAG="FailureActivity";
    private Button  btnBack;
    private TextView textView;


    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.failureactivity);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("登录失败");
        btnBack = (Button) findViewById(R.id.button_Back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(2);
                finish();
            }
        });
    }
}
