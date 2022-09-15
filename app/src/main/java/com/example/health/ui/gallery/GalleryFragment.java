package com.example.health.ui.gallery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.health.Customer;
import com.example.health.DbHandler;
import com.example.health.R;
import com.example.health.TandC;
import com.example.health.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private TextView textView;
    private SeekBar seekBar;
    private EditText firstname;
    private EditText lastname;
    private EditText email;
    private EditText dob;
    private EditText mobile;
    private Button save;

    private FragmentGalleryBinding binding;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        textView=binding.textView6;
        seekBar=binding.seekBar;
        firstname=binding.editTextTextPersonName;
        lastname=binding.editTextTextPersonName1;
        email=binding.editTextTextEmailAddress;
        dob=binding.editTextDate;
        mobile=binding.editTextPhone;
        save=binding.button;



        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                textView.setText(String.valueOf(progress+16));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        firstname.addTextChangedListener(ProfileTextWatcher);
        lastname.addTextChangedListener(ProfileTextWatcher);
        email.addTextChangedListener(ProfileTextWatcher);
        dob.addTextChangedListener(ProfileTextWatcher);
        mobile.addTextChangedListener(ProfileTextWatcher);



        //DATABASE





        return root;
    }


    private TextWatcher ProfileTextWatcher=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String fn=firstname.getText().toString().trim();
            String ln=lastname.getText().toString().trim();
            String em=email.getText().toString().trim();
            String d=dob.getText().toString().trim();
            String m=mobile.getText().toString().trim();
            if(m.length()==10) {
                save.setEnabled(!fn.isEmpty() && !ln.isEmpty() && !em.isEmpty() && !d.isEmpty() && !m.isEmpty());
                DbHandler Handler=new DbHandler(getActivity(),"custdb",null,1);
                Handler.addCustomer(new Customer(1,fn,ln,12,em,d,m));
                Handler.getCustomer(1);
                Handler.close();
            }

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };




    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}