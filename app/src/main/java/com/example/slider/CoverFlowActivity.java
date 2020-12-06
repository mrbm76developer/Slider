package com.example.slider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

public class CoverFlowActivity extends AppCompatActivity {
    SliderView slider;
    int[] image = {R.drawable.messi,
            R.drawable.cr7,
            R.drawable.salah,
            R.drawable.car};
    MySlider mySlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover_flow);
        slider = (SliderView) findViewById(R.id.slider);
        mySlider = new MySlider(image);
        slider.setSliderAdapter(mySlider);
        slider.setIndicatorAnimation(IndicatorAnimationType.WORM);
        slider.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        slider.startAutoCycle();
    }
}