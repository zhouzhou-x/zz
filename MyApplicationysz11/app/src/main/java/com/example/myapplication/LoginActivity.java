package com.example.myapplication;

import android.content.Intent;
import android.hardware.camera2.CaptureFailure;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {
    private final static String TAG = "LoginActivity";
    private EditText txtUserid;
    private EditText txtPwd;
    private Button btnLogin;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.v(TAG, "进入 LoginActivity");
        btnLogin = (Button) findViewById(R.id.button_login);
        txtUserid = (EditText) findViewById(R.id.editText_userid);
        txtPwd = (EditText) findViewById(R.id.editText_password);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtUserid.getText().toString().equals("zz")
                        && txtPwd.getText().toString().equals("123")) {
                    Intent it = new Intent(LoginActivity.this,
                            SuccessActivity.class);
                    it.putExtra("userid",txtUserid.getText().toString());
                    startActivityForResult(it,1);
                } else {
                    Intent it = new Intent(LoginActivity.this,
                            FailureActivity.class);
                    startActivityForResult(it,2);
                }
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        switch (requestCode) {
            case 1:
                Log.v(TAG, "从成功活动返回.resultCode" + resultCode);
                break;
            case 2:
                Log.v(TAG, "从失败活动返回.resultCode" + resultCode);
                break;
        }
            super.onActivityResult(requestCode,resultCode,data);
        }
    }
