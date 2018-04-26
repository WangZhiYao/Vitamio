package space.levan.videodemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * MainActivity
 *
 * @author WangZhiYao
 * @date 2016/9/14
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_play_video)
    public void onClicked() {
        startActivity(new Intent(MainActivity.this, VideoPlayActivity.class));
    }
}
