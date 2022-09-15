package com.example.health.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.health.TandC;
import com.example.health.databinding.FAQsFragmentBinding;
import com.example.health.databinding.FragmentGalleryBinding;

public class FAQs extends Fragment {

    private FAQsFragmentBinding binding;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FAQsViewModel faqsViewModel =
                new ViewModelProvider(this).get(FAQsViewModel.class);

        binding = FAQsFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final WebView webView=binding.webViewFAQs;
        ProgressBar progressBar=binding.progressBarFAQs;
        progressBar.setVisibility(View.VISIBLE);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.credihealth.com/blog/health-faqs-frequently-asked-questions/");
        progressBar.setVisibility(View.GONE);




        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}