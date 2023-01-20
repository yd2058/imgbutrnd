package com.example.imgbutrnd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int [] imgs = new int[3];
    Random rnd = new Random();
    int num;
    Button btn;
    ImageView imager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button);
        imager = (ImageView)findViewById(R.id.imageView);
        imgs[0] = R.drawable.one;
        imgs[1] = R.drawable.two;
        imgs[2] = R.drawable.three;
    }


    public void click(View view) {
        num = rnd.nextInt(3);
        imager.setImageResource(imgs[num]);
        btn.setText(num);
    }
}