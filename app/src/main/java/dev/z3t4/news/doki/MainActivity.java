package dev.z3t4.news.doki;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import dev.z3t4.news.doki.News.Feed;
import dev.z3t4.news.doki.ParallaxEffect.ParallaxRecyclerView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyclerview)
    ParallaxRecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        Feed feed = new Feed(this, recyclerView );
        feed.execute();

    }

}
