package com.tolgaduran.android.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Chris on 7/30/2016.
 * Handles category fragment switching
 */
public class CategoryViewPager extends FragmentPagerAdapter {

    public CategoryViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ParksFragment();
            case 1:
                return new FoodFragment();
            case 2:
                return new FunFragment();
            default:
                return new FitnessFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Parks";
            case 1:
                return "Food";
            case 2:
                return "Fun";
            default:
                return "Fitness";
        }
    }
}