package com.example.custom_recycler_view_practice;

import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PhotoViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView titleText,descriptionText;


    public PhotoViewHolder(@NonNull View itemView) {
        super(itemView);


        imageView =  itemView.findViewById(R.id.image);
        titleText =  itemView.findViewById(R.id.titleTv);
        descriptionText =  itemView.findViewById(R.id.descTv);


    }
}
