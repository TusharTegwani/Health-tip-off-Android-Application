package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TandC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tand_c);
    }
    public void openLogin(View v){
        Toast.makeText(this, "Sign In with Google", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this,BasicDetails.class);
        startActivity(intent);
    }


}