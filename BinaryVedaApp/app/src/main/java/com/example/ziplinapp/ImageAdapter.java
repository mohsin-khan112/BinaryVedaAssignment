package com.example.ziplinapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.MyViewHolder> {

    private final Context mContext;

    public ImageAdapter(Context context) {
        mContext = context;
    }

    private static final String TAG = "ImageAdapter";

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycler_view_item, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imageView.setImageDrawable(getDrawableByName(position));
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    Drawable getDrawableByName(int position) {
        Resources resources = mContext.getResources();
        final int resourceId = resources.getIdentifier("gallery_image_" + (position + 1), "drawable",
                mContext.getPackageName());
        return resources.getDrawable(resourceId);
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}

