package com.example.myapplicationz1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.a51work6.startedservicesample.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);

        // 创建2个按钮控制服务
        Button btnStart = (Button) findViewById(R.id.button_start);
        Button btnStop= (Button) findViewById(R.id.button_stop);


        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent=new Intent(MainActivity.this,MyService.class);
                startService(serviceIntent);
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent=new Intent(MainActivity.this,MyService.class);
                stopService(serviceIntent);
            }
        });
    }
}