package com.example.designlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUsername;
    EditText txtPassword;

    Button btnLogin;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);


        txtUsername = findViewById(R.id.editTextUsername);
        txtPassword = findViewById(R.id.editTextPassword);
        btnLogin = findViewById(R.id.btnLog);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ini action klik button login
                //Toast.makeText(MainActivity.this, txtUsername.getText().toString(), Toast.LENGTH_SHORT).show();
                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();
                if(username.equals("admin")&&password.equals("admin")){
                    //menuju ke kalkulator
                    Intent intent = new Intent(MainActivity.this, kalkulator.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "NOT ENTER", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}