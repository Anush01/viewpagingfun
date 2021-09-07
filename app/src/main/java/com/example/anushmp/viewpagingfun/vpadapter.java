package com.example.anushmp.viewpagingfun;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class vpadapter extends FragmentPagerAdapter {


    public vpadapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if(position == 0){
            Fragment_A a = new Fragment_A();
            return a;
        }

        if(position == 1){
            Fragment_B b = new Fragment_B();
            return b;
        }

        if(position == 2){

            Fragment_C c = new Fragment_C();
            return c;

        }

        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String tabname = "";

        if(position == 0){
            tabname = "frag A";

        }

        if(position == 1){

            tabname = "frag B";

        }

        if(position == 2){
            tabname = "frag C";
        }

        return tabname;

    }

    @Override
    public int getCount() {
        return 3;
    }
}
