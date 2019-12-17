package com.example.myapplicationmh13;

import android.media.MediaPlayer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //播放按钮
    private ImageButton play;
    //暂停按钮
    private ImageButton stop;
    //播放器对象
    private MediaPlayer mMediaPlayer;

    //播放状态
    private static final int PLAYING = 1;
    //暂停状态
    private static final int PAUSE = 8;
    //停止状态
    private static final int STOP = 9;
    //空闲状态
    private static final int IDLE = 5;
    //当前状态
    private int state = IDLE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化播放按钮
        play = (ImageButton) findViewById(R.id.play);
        play.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                if (state == PLAYING) {
                    pause();
                } else {
                    start();
                }
            }
        });

        // 初始化停止按钮
        stop = (ImageButton) findViewById(R.id.stop);
        stop.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                stop();
            }
        });

    }

    // 暂停
    private void pause() {
        mMediaPlayer.pause();
        state = PAUSE;
        play.setImageResource(R.mipmap.mh1);

    }

    // 开始
    private void start() {
        if (state == IDLE || state == STOP) {
            play();
        } else if (state == PAUSE) {
            mMediaPlayer.start();
            state = PLAYING;
        }
        play.setImageResource(R.mipmap.mh3);
    }

    // 停止
    private void stop() {
        mMediaPlayer.stop();
        state = STOP;
        play.setImageResource(R.mipmap.mh1);
    }

    // 播放
    private void play() {
        try {
            if (mMediaPlayer == null || state == STOP) {
                mMediaPlayer = MediaPlayer.create(this, R.raw.mh5);
                mMediaPlayer.setOnPreparedListener(listener);
            } else {
                // 复用MediaPlayer对象
                mMediaPlayer.reset();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private MediaPlayer.OnPreparedListener listener = new MediaPlayer.OnPreparedListener() {
        public void onPrepared(MediaPlayer mediaPlayer) {
            mMediaPlayer.start();
            state = PLAYING;
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Activity销毁后，释放播放器资源
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }
}
