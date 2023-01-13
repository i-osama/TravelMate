package com.zeeshan_s.travelmate.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.zeeshan_s.travelmate.Adapters.PlaceAdapter;
import com.zeeshan_s.travelmate.Models.PlaceModel;
import com.zeeshan_s.travelmate.R;
import com.zeeshan_s.travelmate.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<SlideModel> imageList;
    List<PlaceModel>placeModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        placeModelList=new ArrayList<>();

        placelist();

        PlaceAdapter placeAdapter =new PlaceAdapter(placeModelList,MainActivity.this);
        binding.famBdRecycler.setAdapter(placeAdapter);


        PlaceAdapter placeAdapter1 =new PlaceAdapter(placeModelList,MainActivity.this);
        binding.allPlacesRecycler.setAdapter(placeAdapter1);

//        ---------------------------- Image Slider ------------------------
//        Image Slider data entry example___________
//        imageList.add(SlideModel("String Url" or R.drawable, ScaleTypes.FIT) // for one image
//        imageList.add(SlideModel("String Url" or R.drawable, "Title", ScaleTypes.FIT) // you can with title
//        imageSlider.setImageList(imageList, ScaleTypes.FIT) // for all images

        imageList = new ArrayList<>();
        imageList.add(new SlideModel(R.drawable.flower_garden_img,"Garden", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.tree_and_light_img,"Night", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.mars_human_colony_img,"Mars", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.tree_and_light_img,"Travel", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.travel3,"Freshness", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.travel2jpg,"View", ScaleTypes.CENTER_CROP));

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

    private void placelist() {
 placeModelList.add(new PlaceModel("Coxbazar Sea betch","coxbazar",R.drawable.tree_and_light_img));
 placeModelList.add(new PlaceModel("Potenga Sea betch","chittagong",R.drawable.travel2jpg));
 placeModelList.add(new PlaceModel("Potuyakhali Sea betch","Potuyakhali",R.drawable.travel3));
 placeModelList.add(new PlaceModel("Sitakundo Hill","Chittagong",R.drawable.travel4));
 placeModelList.add(new PlaceModel("Dhaka Park","Dhaka",R.drawable.travel1));
 placeModelList.add(new PlaceModel("Flower Garden","janina",R.drawable.flower_garden_img));
 placeModelList.add(new PlaceModel("Mars human colony","mars",R.drawable.mars_human_colony_img));

    }
}