package com.example.gigaco;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class tools extends AppCompatActivity {
    private VideoView videoView;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);

        // Инициализация VideoView из макета
        videoView = findViewById(R.id.videoView);

        // Установка пути к видеофайлу
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.size; // Здесь R.raw.my_video - это идентификатор видеофайла в ресурсах проекта

        // Создание Uri для видеофайла
        Uri uri = Uri.parse(videoPath);

        // Создание объекта MediaController для управления видео
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        // Установка MediaController в VideoView
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mediaPlayer = mp;
                mediaPlayer.setVolume(0, 0); // Установка громкости звука на 0
                mediaPlayer.start(); // Воспроизведение видео
            }
        });

        // Воспроизведение видео
        videoView.start();
    }

    public void openrazmer(View view) {
        String url = "https://github.com/Avar1tia/SizePy/tree/master"; // замените на вашу ссылку
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}