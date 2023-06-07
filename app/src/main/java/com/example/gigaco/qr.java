package com.example.gigaco;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class qr extends AppCompatActivity {

    private VideoView videoView;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr);

        // Инициализация VideoView из макета
        videoView = findViewById(R.id.videoView);

        // Установка пути к видеофайлу
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.qr; // замените на ваше видео

        // Создание Uri для видеофайла
        Uri uri = Uri.parse(videoPath);

        // Установка Uri в VideoView
        videoView.setVideoURI(uri);

        // Подготовка и воспроизведение видео
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mediaPlayer = mp;
                mediaPlayer.setVolume(0, 0); // Установка громкости звука на 0
                mediaPlayer.start(); // Воспроизведение видео
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    public void qrcode(View v) {
        String url = "https://github.com/Avar1tia/QRPy"; // замените на вашу ссылку
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}