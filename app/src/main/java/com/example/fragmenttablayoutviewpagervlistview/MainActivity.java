package com.example.fragmenttablayoutviewpagervlistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.fragmenttablayoutviewpagervlistview.fragment.FragmentTabAdapter;
import com.example.fragmenttablayoutviewpagervlistview.model.Cong;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout tab;
    private ViewPager viewPager;
    private FragmentTabAdapter fragmentTabAdapter;
    public List<Cong> listM = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ititView();
        fragmentTabAdapter = new FragmentTabAdapter(getSupportFragmentManager(),FragmentTabAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(fragmentTabAdapter);
        tab.setupWithViewPager(viewPager);
    }

    private void ititView() {
        tab = findViewById(R.id.tab);
        viewPager = findViewById(R.id.vPage);
    }
}