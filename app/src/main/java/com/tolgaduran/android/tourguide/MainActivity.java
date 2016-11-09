package com.tolgaduran.android.tourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setElevation(0);

        ViewPager viewPager = (ViewPager) findViewById(R.id.category_view_pager);

        CategoryViewPager categoryViewPager = new CategoryViewPager(getSupportFragmentManager());

        viewPager.setAdapter(categoryViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        tabLayout.setupWithViewPager(viewPager);
    }
}
