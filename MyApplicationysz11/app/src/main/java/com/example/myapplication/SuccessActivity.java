package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SuccessActivity extends AppCompatActivity {
    private final static String TAG="SuccessActivity";
    private Button  btnBack;
    private TextView textView;


    protected void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Log.v(TAG,"进入SuccessActivity");
        Intent it=this.getIntent();
        Bundle bundle = it.getExtras();
        final String userid =bundle.getString("userid");

        textView = (TextView)findViewById(R.id.textView);
        textView.setText("登录成功，Userid:"+ userid);
        btnBack = (Button)findViewById(R.id.button_Back );
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(2,(new Intent()).putExtra("userid",userid));
                finish();
            }
        });
    }
}
