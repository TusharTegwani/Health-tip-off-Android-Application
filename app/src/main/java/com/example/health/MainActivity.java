package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openTandC(View v){
        Toast.makeText(this, "Terms & Conditions", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this,homepage.class);
        startActivity(intent);
    }
}