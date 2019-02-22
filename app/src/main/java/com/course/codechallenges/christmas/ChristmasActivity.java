package com.course.codechallenges.christmas;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;

import com.course.codechallenges.R;
import com.squareup.picasso.Picasso;

public class ChristmasActivity extends AppCompatActivity {

    ImageView mBackgroundImage;
    ImageView mForegroundImage;
    ImageView mStarImage;
    private int mStarState;
    public static final int STAR_ON = 1;
    public static final int STAR_OFF = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_christmas);
        mStarState=STAR_ON;
        initUi();

    }

    private void initUi() {

        mBackgroundImage = findViewById(R.id.background_image);
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        //    int screenHeight = metrics.heightPixels;
        //    int backgroundHeight = (int)Math.floor(0.4 * screenHeight);
        //    mBackgroundImage.getLayoutParams().height=backgroundHeight;
        //    mBackgroundImage.requestLayout();
        mForegroundImage = findViewById(R.id.foreground_image);

        mStarImage = findViewById(R.id.star_image);
        //TODO Add text and buttons
        //TODO Add foreground image
        //TODO Make start turn off when clicked


    }

    public void imageClicked(View v) {
        if(mStarState==STAR_ON) {
            mStarImage.setImageResource(android.R.drawable.btn_star_big_off);
            mStarState=STAR_OFF;
        }
        else {
         mStarImage.setImageResource(android.R.drawable.btn_star_big_on);
         mStarState=STAR_ON;
        }

    }
}
