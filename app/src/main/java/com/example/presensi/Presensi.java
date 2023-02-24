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

public class Presensi extends AppCompatActivity {


    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presensi);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!= null) {
            actionBar.setDefaultDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Halaman Absen");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return true;
    }


    public void absen(View view) {
        Intent intent = new Intent(Presensi.this, Status.class);
        startActivity(intent);
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