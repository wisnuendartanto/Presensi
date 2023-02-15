package com.example.presensi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private Button btnLogin;

    private String username="tes";
    private String password="tes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUsername.getText().toString().equalsIgnoreCase(username)&&etPassword.getText().toString().equalsIgnoreCase(password)){
                    Intent Login = new Intent(MainActivity.this,BerandaActivity.class);
                    startActivity(Login);

                    Toast.makeText(MainActivity.this,"Login Berhasil",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"Username dan Password Salah",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void pindah(View view) {
         Intent intent = new Intent(MainActivity.this,Password.class);
         startActivity(intent);
    }


}