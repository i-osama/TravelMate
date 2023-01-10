package com.zeeshan_s.travelmate.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.zeeshan_s.travelmate.R;
import com.zeeshan_s.travelmate.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<SlideModel> imageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        ---------------------------- Image Slider ------------------------
//        Image Slider data entry example___________
//        imageList.add(SlideModel("String Url" or R.drawable, ScaleTypes.FIT) // for one image
//        imageList.add(SlideModel("String Url" or R.drawable, "Title", ScaleTypes.FIT) // you can with title
//        imageSlider.setImageList(imageList, ScaleTypes.FIT) // for all images

        imageList = new ArrayList<>();
        imageList.add(new SlideModel(R.drawable.flower_garden_img,"Garden", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.tree_and_light_img,"Night", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.mars_human_colony_img,"Mars", ScaleTypes.CENTER_CROP));

        binding.imageSlider.setImageList(imageList);

        binding.searchBar.setOnClickListener(view -> {
//            Log.i("TAG", "onCreate:-----------------Main search ");
//
//            Intent intent  = new Intent(MainActivity.this, Search_Item_BucketActivity.class);
//            startActivity(intent);
            startActivity(new Intent(MainActivity.this, Search_Item_BucketActivity.class));
            finish();
        });
    }
}