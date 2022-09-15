package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity3 extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView=findViewById(R.id.textView10);
        textView2=findViewById(R.id.textView11);
        Intent intent=getIntent();
        String bmi=intent.getStringExtra(BMI.Bmi_is);
        textView.setText("-> Your BMI is: "+bmi+" kg/m2.");

        float f=Float.parseFloat(bmi);
        if(f<16)
            textView2.setText("-> You are in Severe Thinness range.");
        else if(f>=16 && f<17)
            textView2.setText("-> You are in Moderate Thinness range.");
        else if(f>=17 && f<18.5)
            textView2.setText("-> You are in Mild Thinness range.");
        else if(f>=18.5 && f<25)
            textView2.setText("-> You are in Normal range.");
        else if(f>=25 && f<30)
            textView2.setText("-> You are in Overweight range.");
        else if(f>=30 && f<35)
            textView2.setText("-> You are in Obese Class I range.");
        else if(f>=35 && f<40)
            textView2.setText("-> You are in Obese Class II range.");
        else if(f>=40)
            textView2.setText("-> You are in Obese Class III range.");
    }
    public void openMenu(View v){

        Intent intent =new Intent(this,homepage.class);
        startActivity(intent);
    }

}