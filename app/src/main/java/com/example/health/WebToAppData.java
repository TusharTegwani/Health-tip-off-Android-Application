package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

public class WebToAppData extends AppCompatActivity {

    private WebView webView;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_to_app_data);

        webView=findViewById(R.id.webViewHom);
        progressBar=findViewById(R.id.progressBarHome);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            if(bundle.getString("URL")!=null){
                Toast.makeText(getApplicationContext(), bundle.getString("URL"), Toast.LENGTH_SHORT).show();
                progressBar.setVisibility(View.VISIBLE);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl(bundle.getString("URL"));
                progressBar.setVisibility(View.GONE);
            }
        }


    }
}