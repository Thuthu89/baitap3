package com.example.bt;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView tv_signup = findViewById(R.id.idSignUp);
        tv_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });
        EditText edt_gmail = findViewById(R.id.inputEmail);
        EditText edt_pass = findViewById(R.id.inputPassword);
        Button bt_login = findViewById(R.id.btnlogin);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                    String ip_gmail = edt_gmail.getText().toString().trim();
                    String ip_pass = edt_pass.getText().toString().trim();
                    if(!ip_gmail.isEmpty() && !ip_pass.isEmpty()){
                        Toast.makeText(LoginActivity.this,"xin chao ban co gmail "+ip_gmail,Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(LoginActivity.this,"Chưa nhap du thong tin",Toast.LENGTH_LONG).show();
                    }
            }
        });

    }
}