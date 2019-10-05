package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editUsername, editPassword;
    private Button btnLogin;

    private String username="xh1210", password="1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListener();
    }

    private void findViews(){
        editUsername=findViewById(R.id.username);
        editPassword=findViewById(R.id.pw);
        btnLogin=findViewById(R.id.login);
    }

    private void setListener(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputUsername=editUsername.getText().toString();
                String inputPassword=editUsername.getText().toString();

                if (inputUsername.equals(username) && inputPassword.equals(password)){
                    Toast.makeText(MainActivity.this,"Login Succesful", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"Login Fail", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
