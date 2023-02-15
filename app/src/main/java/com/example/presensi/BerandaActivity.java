package com.example.presensi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BerandaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
    }


    public void presensi(View view) {
        Intent intent = new Intent(BerandaActivity.this,Presensi.class);
        startActivity(intent);
    }

    public void kehadiran(View view) {
        Intent intent = new Intent(BerandaActivity.this,Kehadiran.class);
        startActivity(intent);
    }

    public void DataPribadi(View view) {
        Intent intent = new Intent(BerandaActivity.this, Personal.class);
        startActivity(intent);
    }

    public void ijin(View view) {
        Intent intent = new Intent(BerandaActivity.this, Ijin.class);
        startActivity(intent);
    }
}