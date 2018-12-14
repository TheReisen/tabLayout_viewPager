package com.example.ybcf8.assignment_6;

import android.support.annotation.BinderThread;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    TabLayout mTabLayout;
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        mTabLayout = findViewById(R.id.tablayout);
        mViewPager = findViewById(R.id.viewpager);
        List<String> titles = new ArrayList<>();
        List<Fragment> views = new ArrayList<>();

            int[] imageIds = {R.drawable.illust_4884113_20180211_234120,
                    R.drawable.illust_12209994_20181212_082127,
                    R.drawable.illust_22092921_20180211_234124,
                    R.drawable.illust_25346807_20181204_172549,
                    R.drawable.illust_3440684_20181212_082116};

        Fragment fragment = new Fragment();

                for (int p = 0; p < 5 ; p++) {
                    titles.add("Tab_" + p);
                    fragment.setData(imageIds[p]);
                    views.add(fragment);
                }

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), views, titles);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}