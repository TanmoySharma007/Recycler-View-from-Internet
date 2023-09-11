package com.example.custom_recycler_view_practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.time.Instant;
import java.util.List;

public class PhotoAdapter extends RecyclerView.Adapter <PhotoViewHolder>{

    Context context ;
    List <Photo> photoList;

    public PhotoAdapter (Context context, List<Photo> photoList) {
        this.context = context;
        this.photoList = photoList;
    }
    @NonNull
    @Override
    public PhotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

      View view = LayoutInflater.from (context).inflate(R.layout.item_photo, parent, false);

      PhotoViewHolder photoViewHolder = new PhotoViewHolder(view);

        return photoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoViewHolder holder, int position) {

        Photo photo = photoList.get(position);

        holder.titleText.setText(photo.getTitle());
        holder.descriptionText.setText(photo.getDescription());


        Glide.with(context).load(photo.getImageUrl()).placeholder(R.drawable.ash).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return photoList.size();
    }
}
