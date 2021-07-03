package com.example.ziplinapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {

    SwitchCompat profileSwitch;
    TabLayout tabLayout;
    ViewPager viewPager;
    MyViewPagerAdapter pagerAdapter;
    List<String> tabTitleList;
    Context mcontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        mcontext=this;
        profileSwitch = findViewById(R.id.switch_Profile);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        setupViewPager();
        tabLayout.setupWithViewPager(viewPager);
        setupCustomTabLayout();
    }

    private void setupViewPager() {
        tabTitleList = new ArrayList<>();
        tabTitleList.add("Upload");
        tabTitleList.add("Exhibition");
        tabTitleList.add("Revenue");
        pagerAdapter = new MyViewPagerAdapter(tabTitleList, getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

    }

    private void setupCustomTabLayout() {
        for (int i = 0; i < tabTitleList.size(); i++) {
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            View view = getLayoutInflater().inflate(R.layout.layout_custom_tab, null);
            ImageView imageView = view.findViewById(R.id.tabIcon);
            TextView textView = view.findViewById(R.id.tabName);
            int drawableId;
            if (i == 0) {
                drawableId = R.drawable.ic_upload;
                textView.setText("Upload");
            } else if (i == 1) {
                drawableId = R.drawable.ic_gallery;
                textView.setText("Exhibition");
            } else {
                drawableId = R.drawable.ic_revenu;
                textView.setText("Revenue");
            }
            imageView.setImageResource(drawableId);
            tab.setCustomView(view);
        }
    }
}