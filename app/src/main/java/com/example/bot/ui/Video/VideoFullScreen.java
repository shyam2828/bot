package com.example.bot.ui.Video;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.bot.R;

public class VideoFullScreen extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_full_screen);
        webView=findViewById(R.id.full_video);

        String link=getIntent().getStringExtra("link");
        webView.loadUrl(link);

    }

}