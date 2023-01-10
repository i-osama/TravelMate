package com.zeeshan_s.travelmate.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.zeeshan_s.travelmate.Fragment.SearchFragment;
import com.zeeshan_s.travelmate.R;

public class Search_Item_BucketActivity extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_item_bucket);

        viewPager = findViewById(R.id.searchAndItemBucket);
//        Log.i("TAG", "onCreate: -----------------");

        SearchFragment searchFragment = new SearchFragment();
        FragmentPagerAdapter pagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return new SearchFragment();
            }

            @Override
            public int getCount() {
                return 1;
            }
        };
        viewPager.setAdapter(pagerAdapter);


    }
}