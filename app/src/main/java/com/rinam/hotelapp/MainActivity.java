package com.rinam.hotelapp;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView _imageview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageview1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://png.pngtree.com/thumb_back/fh260/background/20230216/pngtree-cancun-forum-beach-playa-gaviota-azul-in-mexico-at-hotel-zone-image_1589666.jpg";
        Picasso.with(this).load(imageUrl).into(_imageview1);


    }
}