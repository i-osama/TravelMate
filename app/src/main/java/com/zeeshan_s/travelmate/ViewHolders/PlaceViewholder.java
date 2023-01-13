package com.zeeshan_s.travelmate.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.zeeshan_s.travelmate.R;

public class PlaceViewholder extends RecyclerView.ViewHolder {

    public ImageView placeImg;
    public TextView placeName,placeLocation;

    public PlaceViewholder(@NonNull View itemView) {
        super(itemView);
        placeImg=itemView.findViewById(R.id.placeImg);
        placeLocation=itemView.findViewById(R.id.placeLocation);
        placeName=itemView.findViewById(R.id.placeName);
    }
}
