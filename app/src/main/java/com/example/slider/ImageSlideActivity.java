package com.example.slider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class ImageSlideActivity extends AppCompatActivity {
    private ImageSlider imgSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slide);
        SetupView();
        String url = "https://external-preview.redd.it/GOkP8onbuyjGmN9Rc8Que5mw21CdSw6OuXpAKUuE6-4.jpg?auto=webp&s=2bc0e522d1f2fa887333286d557466b2be00fa5e";
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.pic7, "Image 1 "));
        slideModels.add(new SlideModel(R.drawable.pic8, "Image 2 "));
        slideModels.add(new SlideModel(R.drawable.pic9, "Image 3 "));
        slideModels.add(new SlideModel(R.drawable.pic10, "Image 4 "));
        slideModels.add(new SlideModel(url, "Image 5 "));
        imgSlider.setImageList(slideModels, true);
        imgSlider.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemSelected(int i) {
                for (SlideModel str : slideModels) {
                    Toast.makeText(ImageSlideActivity.this, str.getTitle() + "", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }

    private void SetupView() {
        imgSlider = findViewById(R.id.imgSlider);
    }
}