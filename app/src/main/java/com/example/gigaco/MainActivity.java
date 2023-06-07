package com.example.gigaco;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Info(View v) {
        Intent intent = new Intent(this, info.class);
        startActivity(intent);
    }

    public void openSiz(View v) {
        Intent intent = new Intent(this, siz.class);
        startActivity(intent);
    }

    public void gotorazmer(View v) {
        Intent intent = new Intent(this, tools.class);
        startActivity(intent);
    }


    public void gotocolor(View view) {
        Intent intent = new Intent(this, colors.class);
        startActivity(intent);
    }

    public void gotodangerzone(View view) {
        Intent intent = new Intent(this, dangerzone.class);
        startActivity(intent);
    }

    public void gokachestvo(View view) {
        Intent intent = new Intent(this, kachestvo.class);
        startActivity(intent);
    }

    public void gotodetali(View view) {
        Intent intent = new Intent(this, detali.class);
        startActivity(intent);
    }

    public void goqr(View view) {
        Intent intent = new Intent(this, qr.class);
        startActivity(intent);
    }
}