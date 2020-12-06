package com.example.slider;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ViewListener;

public class MainActivity extends AppCompatActivity {
    CarouselView carouselView;
    int[] image = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5, R.drawable.pic6};
    String[] tileImage = {"جاده", "آبشار", "ماشین", "هندوانه", "گل", "قهوه"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetupView();
        carouselView.setPageCount(image.length);
        carouselView.setSlideInterval(4000);
        carouselView.setRotationY(180);
        carouselView.setViewListener(viewListener);

    }

    ViewListener viewListener = new ViewListener() {
        @Override
        public View setViewForPosition(int position) {
            View view = getLayoutInflater().inflate(R.layout.item_view, null);
            ImageView imgItemView = (ImageView) view.findViewById(R.id.imgItemView);
            TextView txtItemView = (TextView) view.findViewById(R.id.txtItemView);
            RelativeLayout mainLayout = (RelativeLayout) view.findViewById(R.id.mainLayout);
            imgItemView.setImageResource(image[position]);
            txtItemView.setText(tileImage[position]);
            view.setRotationY(180);
            mainLayout.setOnClickListener(view1 -> {
                Toast.makeText(MainActivity.this, tileImage[position], Toast.LENGTH_SHORT).show();
            });
            return view;
        }
    };

    private void SetupView() {
        carouselView = findViewById(R.id.carouselView);
    }
}