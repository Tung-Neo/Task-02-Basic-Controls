package com.example.pictureswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    boolean iscat1 = true;

    public void setChangePic(View v){
        Log.i("info", "Change pressed");

        ImageView img = findViewById(R.id.imageView);
        if (iscat1){
            img.setImageResource(R.drawable.cat2);
            iscat1 = false;
        }else{
            img.setImageResource(R.drawable.cat1);
            iscat1 = true;
        }
    }

//
//

    public void hotface(View v){
        Log.i("Info", "Change pressed");

        int[] imgs = {
                R.drawable.hotface1,
                R.drawable.hotface2,
                R.drawable.hotface3,
                R.drawable.hotface4,
                R.drawable.hotface5,
                R.drawable.hotface6
        };

        ImageView imageView = findViewById(R.id.imageView2);

        Random r = new Random();

        int i = r.nextInt(imgs.length);
        imageView.setImageResource(imgs[i]);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int j = r.nextInt(imgs.length);
                imageView.setImageResource(imgs[j]);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}