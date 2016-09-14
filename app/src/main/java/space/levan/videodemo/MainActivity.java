package space.levan.videodemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by WangZhiYao on 16/9/14.
 */
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.tv_fullscreen)
    TextView mTvFullScreen;
    @OnClick(R.id.tv_fullscreen)
    public void onClick()
    {
        Intent intent = new Intent(MainActivity.this, VideoPlayActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mTvFullScreen = (TextView) findViewById(R.id.tv_fullscreen);
        mTvFullScreen.setText("DEMO");
        mToolbar.setTitle(getResources().getString(R.string.app_name));
    }
}