package com.course.codechallenges.voyage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.course.codechallenges.R;

public class VoyageViewHolder extends RecyclerView.ViewHolder {

    private ImageView mPicture;
    private TextView mMoment;
    private TextView mLocation;
    private Context mContext;
    private View mItem;

    public VoyageViewHolder(@NonNull View itemView,Context context) {
        super(itemView);
        initUi(itemView);
        mContext=context;

    }
    private void initUi(View itemView) {
        mItem=itemView;
        mPicture=itemView.findViewById(R.id.picture);
        mMoment=itemView.findViewById(R.id.moment_text);
        mLocation=itemView.findViewById(R.id.location_text);
        initHandlers();

    }

    private void initHandlers(){
        mItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onItemClicked(v);
            }
        });



    }
    public void setContext(Context context){
        this.mContext=context;
    }
    public Context getContext(){
        return mContext;
    }

    public ImageView getPicture() {
        return mPicture;
    }

    public void setPicture(ImageView picture) {
        mPicture = picture;
    }

    public TextView getMoment() {
        return mMoment;
    }

    public TextView getLocation() {
        return mLocation;
    }

    public void setLocation(TextView location) {
        mLocation = location;
    }

    public void setMoment(TextView moment) {
        mMoment = moment;
    }
    public void onItemClicked(View v){
        String location = getLocation().getText().toString();
        String moment = getMoment().getText().toString();
        int pictureId = (int)(mPicture.getTag());

        Bundle bundle = new Bundle();
        bundle.putString("location",location);
        bundle.putString("moment",moment);
        bundle.putInt("picture",pictureId);
        Intent intent=new Intent(mContext,GalleryActivity.class);
        intent.putExtras(bundle);
        mContext.startActivity(intent);

    }
}
