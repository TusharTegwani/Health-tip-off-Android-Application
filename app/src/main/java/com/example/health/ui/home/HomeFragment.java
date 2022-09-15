package com.example.health.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.health.BMI;
import com.example.health.WebToAppData;
import com.example.health.databinding.FragmentHomeBinding;
import com.example.health.homepage;

public class HomeFragment extends Fragment {


    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //Diabetes

        final ImageButton imagebutton = binding.imageView18;
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.mayoclinic.org/diseases-conditions/diabetes/symptoms-causes/syc-20371444");
                startActivity(intent);
            }
        });

        //High Blood Pressure

        final ImageButton imagebutton1 = binding.imageView19;
        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.mayoclinic.org/diseases-conditions/high-blood-pressure/symptoms-causes/syc-20373410");
                startActivity(intent);
            }
        });

        //General

        final ImageButton imagebutton2 = binding.imageView21;
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.medicinenet.com/healthy_living/article.htm");
                startActivity(intent);
            }
        });

        //Low Blood Pressure

        final ImageButton imagebutton3 = binding.imageView22;
        imagebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.mayoclinic.org/diseases-conditions/low-blood-pressure/symptoms-causes/syc-20355465");
                startActivity(intent);
            }
        });

        //Asthma

        final ImageButton imagebutton4 = binding.imageView23;
        imagebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.mayoclinic.org/diseases-conditions/asthma/symptoms-causes/syc-20369653");
                startActivity(intent);
            }
        });

        //Cough & Cold

        final ImageButton imagebutton5 = binding.imageView24;
        imagebutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.mayoclinic.org/diseases-conditions/common-cold/symptoms-causes/syc-20351605");
                startActivity(intent);
            }
        });

        //Dental Hygiene

        final ImageButton imagebutton6 = binding.imageView25;
        imagebutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.healthline.com/health/dental-and-oral-health/best-practices-for-healthy-teeth");
                startActivity(intent);
            }
        });

        //Eye Sight

        final ImageButton imagebutton7 = binding.imageView26;
        imagebutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.healthline.com/health/how-to-improve-eyesight");
                startActivity(intent);
            }
        });

        //Hair Loss

        final ImageButton imagebutton8 = binding.imageView27;
        imagebutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.healthline.com/health/regrow-hair-naturally#10");
                startActivity(intent);
            }
        });

        //Under Weight

        final ImageButton imagebutton9 = binding.imageView28;
        imagebutton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.mayoclinic.org/healthy-lifestyle/nutrition-and-healthy-eating/expert-answers/underweight/faq-20058429");
                startActivity(intent);
            }
        });

        //Insomnia

        final ImageButton imagebutton10 = binding.imageView29;
        imagebutton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.mayoclinic.org/diseases-conditions/insomnia/symptoms-causes/syc-20355167");
                startActivity(intent);
            }
        });

        //Thyroid

        final ImageButton imagebutton11 = binding.imageView30;
        imagebutton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.healthline.com/health/hypothyroidism/five-natural-remedies-for-hypothyroidism#natural-remedies");
                startActivity(intent);
            }
        });

        //Cholesterol

        final ImageButton imagebutton12 = binding.imageView31;
        imagebutton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.healthline.com/health/heart-disease/natural-remedies-cholesterol");
                startActivity(intent);
            }
        });

        //Obesity

        final ImageButton imagebutton13 = binding.imageView32;
        imagebutton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.mayoclinic.org/diseases-conditions/obesity/symptoms-causes/syc-20375742");
                startActivity(intent);
            }
        });

        //Upset Stomach

        final ImageButton imagebutton14 = binding.imageView33;
        imagebutton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.healthline.com/health/digestive-health/natural-upset-stomach-remedies#chamomile-tea");
                startActivity(intent);
            }
        });

        //PCOD

        final ImageButton imagebutton15 = binding.imageView34;
        imagebutton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.mayoclinic.org/diseases-conditions/pcos/symptoms-causes/syc-20353439");
                startActivity(intent);
            }
        });

        //Orthopedic
        final ImageButton imagebutton16 = binding.imageView35;
        imagebutton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.healthline.com/nutrition/build-healthy-bones");
                startActivity(intent);
            }
        });

        //Skin

        final ImageButton imagebutton17 = binding.imageView36;
        imagebutton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.healthline.com/health/beauty-skin-care/home-remedies-for-glowing-skin");
                startActivity(intent);
            }
        });

        //Covid-19

        final ImageButton imagebutton18 = binding.imageView37;
        imagebutton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.mayoclinic.org/diseases-conditions/coronavirus/in-depth/treating-covid-19-at-home/art-20483273");
                startActivity(intent);
            }
        });

        //Dehydration

        final ImageButton imagebutton19 = binding.imageView38;
        imagebutton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), WebToAppData.class);
                intent.putExtra("URL","https://www.mayoclinic.org/diseases-conditions/dehydration/symptoms-causes/syc-20354086");
                startActivity(intent);
            }
        });

        //BMI

        final ImageButton imagebutton20 = binding.imageView39;
        imagebutton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), BMI.class);
                //intent.putExtra("URL","");
                startActivity(intent);
            }
        });


        return root;
    }


}