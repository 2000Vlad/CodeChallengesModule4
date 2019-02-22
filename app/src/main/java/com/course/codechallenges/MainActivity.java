package com.course.codechallenges;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.course.codechallenges.androidlogo.AndroidLogoActivity;
import com.course.codechallenges.beautyandthebeast.BeautyAndTheBeastActivity;
import com.course.codechallenges.christmas.ChristmasActivity;
import com.course.codechallenges.students.RecyclerViewActivity;
import com.course.codechallenges.voyage.Voyage;
import com.course.codechallenges.voyage.VoyageActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void navigateAndroid(View v) {
        Intent intent=new Intent(this, AndroidLogoActivity.class);
        startActivity(intent);

    }
    public void navigateTheBeautyAndTheBeast(View v){
        Intent intent=new Intent(this, BeautyAndTheBeastActivity.class);
        startActivity(intent);
    }
    public void navigateChristmas(View v) {
        Intent intent=new Intent(this, ChristmasActivity.class);
        startActivity(intent);
    }
    public void navigateStudents(View v){
        Intent intent=new Intent(this, RecyclerViewActivity.class);
        startActivity(intent);
    }
    public void navigateVoyage(View v){
        Intent intent=new Intent(this, VoyageActivity.class);
        startActivity(intent);
    }
}
