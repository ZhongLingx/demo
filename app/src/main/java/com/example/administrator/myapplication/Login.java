package com.example.administrator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2017/10/22.
 */

public class Login extends AppCompatActivity  implements View.OnClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        Button signin_button=(Button)findViewById(R.id.signin_button);
        signin_button.setOnClickListener(this);

        Button register_link=(Button)findViewById(R.id.register_link);
        register_link.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Login.this,MainActivity.class);
        startActivity(intent);

    }
}
