package com.example.ziplinapp;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class MyViewPagerAdapter extends FragmentStatePagerAdapter {

    private List<String> tabTitleList;

    private static final String TAG = "MyViewPagerAdapter";

    public MyViewPagerAdapter(List<String> tabTitleList, FragmentManager fm) {
      super(fm);
      this.tabTitleList = tabTitleList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return new PagerFragment();
    }

    @Override
    public int getCount() {
        return tabTitleList.size();
    }
}
