package com.example.presensi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class Kehadiran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kehadiran);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_ubah_password:
                Toast.makeText(getApplicationContext(), "Ubah Password", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_faq:
                Toast.makeText(getApplicationContext(), "FAQ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_logout:
                Toast.makeText(getApplicationContext(), "Logout", Toast.LENGTH_SHORT).show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}