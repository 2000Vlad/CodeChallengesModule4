package com.course.codechallenges.beautyandthebeast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.course.codechallenges.R;

public class BeautyAndTheBeastActivity extends AppCompatActivity {
    private ImageView markImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty_and_the_beast);
        markImage=findViewById(R.id.mark);
    }
    private boolean markon=false;
    public void changeMark(View v){
        if(markon) {
            markImage.setImageResource(R.drawable.ic_markoff);
            markon=false;
        }
        else {
            markImage.setImageResource(R.drawable.ic_markon);
            markon=true;
        }
    }
}
