package com.example.anushmp.viewpagingfun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements fragcommslistner {

    private ViewPager vp;
    TabLayout tl;
    FragmentManager fm;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = findViewById(R.id.vp);

        tl = findViewById(R.id.tabby);
        setVpAdapter();

        tl.setupWithViewPager(vp,true);

    }

    private void setVpAdapter() {

        vpadapter adapter = new vpadapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        vp.setAdapter(adapter);
    }


    public void setData(String name){
        this.name = name;

    }

    public String getName(){
        return this.name;
    }

    public void setcurrentitem(int item){
        vp.setCurrentItem(item);
    }

    @Override
    public void onclick(Bundle incoming) {

        //String data = incoming.getString("data");

        Fragment_B bfrag = new Fragment_B();
        bfrag.setArguments(incoming);

        fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();






    }
}