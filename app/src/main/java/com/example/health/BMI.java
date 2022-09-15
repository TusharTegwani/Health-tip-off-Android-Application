package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BMI extends AppCompatActivity {
    EditText bmi;
    private EditText editTextNumber;
    private EditText editTextNumber2;
    private EditText getEditTextNumber3;
    private Button buttonConfirm;
    public static final String Bmi_is="com.example.health_tush";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

    }



    public void openMA3(View v) {


        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        getEditTextNumber3 = findViewById(R.id.editTextNumber3);
        buttonConfirm=findViewById(R.id.button3);
        String hf1 = editTextNumber.getText().toString();
        String hi1 = editTextNumber2.getText().toString();
        String wk1 = getEditTextNumber3.getText().toString();

            Intent intent = new Intent(this, MainActivity3.class);
            int hf = Integer.parseInt(hf1);
            hf = hf * 12;
            int hi = Integer.parseInt(hi1);
            int h = hf + hi;

            float wk = Float.parseFloat(wk1);
            float w_lbs = (float) (wk * 2.205);
            float bmi = (float) ((w_lbs / (h * h)) * 703);
            String ans = String.valueOf(bmi);
            intent.putExtra(Bmi_is, ans);

            startActivity(intent);
    }



}