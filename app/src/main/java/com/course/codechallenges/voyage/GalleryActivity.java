package com.course.codechallenges.voyage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.course.codechallenges.R;

public class GalleryActivity extends AppCompatActivity {

    private ImageView mPicture;
    private TextView mLocationText;
    private TextView mMomentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        initUi();
    }
    private void initUi(){
        mPicture = findViewById(R.id.picture);
        mLocationText= findViewById(R.id.location_text);
        mMomentText = findViewById(R.id.moment_text);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int picture=bundle.getInt("picture");
        String location=bundle.getString("location");
        String moment=bundle.getString("moment");

        mPicture.setImageResource(picture);
        mLocationText.setText("Location:"+location);
        mMomentText.setText("Moment:"+moment);

    }

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"GalleryActivity.onDestroy()",Toast.LENGTH_LONG);
    }
}
