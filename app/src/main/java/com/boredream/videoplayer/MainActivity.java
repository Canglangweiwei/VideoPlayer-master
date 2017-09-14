package com.boredream.videoplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn_start)
    Button btnstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bd_activity_main);
        ButterKnife.bind(this);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoDetailInfo info = MockUtils.mockData(VideoDetailInfo.class);
                VideoDetailActivity.start(MainActivity.this, info);
            }
        });
    }
}
