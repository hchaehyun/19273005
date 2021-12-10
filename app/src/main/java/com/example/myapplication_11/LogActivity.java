package com.example.myapplication_11;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogActivity extends AppCompatActivity {
    EditText userid;
    EditText userpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        userid = findViewById(R.id.userid);
        userpass = findViewById(R.id.userpass);
        Button loginBtn = findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginProcess(view);
            }
        });


    }
    public void loginProcess(View view){
        String uid = userid.getText().toString();
        String upass = userpass.getText().toString();
        if(uid.equals("user") && upass.equals("password")){
            Toast.makeText(this, "로그인 성공", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(LogActivity.this,ChooseActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "로그인 정보가 없습니다", Toast.LENGTH_LONG).show();
            userpass.setText("");
        }
    }
}
