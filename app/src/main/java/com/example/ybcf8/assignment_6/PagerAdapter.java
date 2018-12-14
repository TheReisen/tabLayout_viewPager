package com.example.ybcf8.assignment_6;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter {
    private Context context;
    private List<Fragment> fragmentList;
    private List<String> mTitles;

    public PagerAdapter(FragmentManager fm, List<com.example.ybcf8.assignment_6.Fragment> fragments, List<String> titles) {
        super(fm);
        this.context = context;
        this.mTitles = titles;
        this.fragmentList = fragmentList;
    }

    public PagerAdapter(List<View> views) {
        super((FragmentManager) views);
    }

    @Nullable
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return 30;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }

}
