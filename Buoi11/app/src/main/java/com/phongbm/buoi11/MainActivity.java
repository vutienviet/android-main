package com.phongbm.buoi11;

import android.databinding.DataBindingUtil;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.phongbm.buoi11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    private ActivityMainBinding binding;
    private ActionBarDrawerToggle toggle;
    private PagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setUpActionBar();
        initSliding();
        initPager();
    }

    private void initPager() {
        adapter = new PageAdapter(getSupportFragmentManager());
        binding.main.viewPager.setAdapter(adapter);
//        binding.main.viewPager.setCurrentItem();
        binding.main.viewPager.addOnPageChangeListener(this);
        binding.main.tabLayout.setupWithViewPager(binding.main.viewPager);
    }

    private void initSliding() {
        toggle = new ActionBarDrawerToggle(this,
                binding.drawerLayout,
                R.string.app_name,
                R.string.app_name);
        binding.drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    private void setUpActionBar() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    @Override
    public void onPageSelected(int i) {
        if (i ==0){
            FragmentNews.getInstance().setNumber();
        }
    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }
}
