package com.course.codechallenges.voyage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.course.codechallenges.R;

import java.util.ArrayList;
import java.util.List;

public class VoyageActivity extends AppCompatActivity {
    public static final int VOYAGE_COUNT = 6;
    private RecyclerView mVoyagesRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voyage);
        initUi();

    }
    private void initUi(){
        mVoyagesRecycler = findViewById(R.id.voyage_recycler);
        mVoyagesRecycler.setLayoutManager(new LinearLayoutManager(this));
        VoyageAdapter adapter=new VoyageAdapter(getSource());
        mVoyagesRecycler.setAdapter(adapter);
    }
    public List<Voyage> getSource() {
        ArrayList<Voyage> voyages = new ArrayList<>();
        List<Integer> pictures = getPictures();
        List<String> locations = getLocations();
        List<String> moments = getMoments();
        Voyage voyage;
        for (int i = 0; i < 6; i++) {
            voyage = new Voyage();
            voyage.setImage(pictures.get(i));
            voyage.setLocation(locations.get(i));
            voyage.setMoment(moments.get(i));
            voyages.add(voyage);

        }
        return voyages;
    }

    private List<Integer> getPictures() {
        ArrayList<Integer> pictures = new ArrayList<>();

        pictures.add(R.drawable.voyage_1);
        pictures.add(R.drawable.voyage_2);
        pictures.add(R.drawable.voyage_3);
        pictures.add(R.drawable.voyage_4);
        pictures.add(R.drawable.voyage_5);
        pictures.add(R.drawable.voyage_6);

        return pictures;
    }

    private List<String> getMoments() {
        ArrayList<String> moments = new ArrayList<>();
        moments.add("Holiday 2017");
        moments.add("Fall 2017");
        moments.add("Summer 2017");
        moments.add("Winter 2017");
        moments.add("Spring 2018");
        moments.add("Summer 2018");
        return moments;
    }

    private List<String> getLocations() {
        ArrayList<String> locations = new ArrayList<>();

        locations.add("Islands");
        locations.add("Rome");
        locations.add("London");
        locations.add("Paris");
        locations.add("San Francisco");
        locations.add("Alaska");

        return locations;

    }

}
