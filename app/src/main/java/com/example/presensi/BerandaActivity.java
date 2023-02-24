package com.example.presensi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class BerandaActivity extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!= null) {
            actionBar.setDefaultDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Presensi Non ASN");
        }
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



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_ubah_password:
                Toast.makeText(getApplicationContext(),"Ubah Password", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_faq:
                Toast.makeText(getApplicationContext(),"FAQ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_logout:
                Toast.makeText(getApplicationContext(),"Logout", Toast.LENGTH_SHORT).show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}