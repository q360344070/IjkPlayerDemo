package com.stormdzh.ijkplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.stormdzh.ijkplayer.ijk.VideoPlayerIJK;

public class MainActivity extends AppCompatActivity {

    private VideoPlayerIJK mVideoPlayerIJK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mVideoPlayerIJK = findViewById(R.id.mVideoPlayerIJK);


        String videoPath = "http://v-cdn.zjol.com.cn/280443.mp4";
        mVideoPlayerIJK.setVideoPath(videoPath);
        mVideoPlayerIJK.start();
    }
}
