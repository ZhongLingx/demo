package com.example.administrator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/10/22.
 */

public class Login extends AppCompatActivity  implements View.OnClickListener{
    private EditText  username;
    private EditText  userpwd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        //找到输入用户名和密码的控件
        username = (EditText) findViewById(R.id.username_edit);
        userpwd = (EditText) findViewById(R.id.password_edit);

        Button signin_button=(Button)findViewById(R.id.signin_button);
        signin_button.setOnClickListener(this);

        Button register_link=(Button)findViewById(R.id.register_link);
        register_link.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String name = username.getText().toString().trim();
        String pwd = userpwd.getText().toString().trim();


        if(TextUtils.isEmpty(name) ||TextUtils.isEmpty(pwd)){
            Toast.makeText(this, "用户名或密码不能为空", Toast.LENGTH_SHORT).show();
        }else if("123".equals(name) && "456".equals(pwd)){
            Intent intent = new Intent(Login.this,MainActivity.class);
            startActivity(intent);
        }


    }
}
