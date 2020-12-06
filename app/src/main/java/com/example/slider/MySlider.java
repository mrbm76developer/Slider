package com.example.slider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;

public class MySlider extends SliderViewAdapter<MySlider.Holder> {
    int[] images;

    public MySlider(int[] images) {
        this.images = images;
    }
    class Holder extends SliderViewAdapter.ViewHolder {
        ImageView img1;

        public Holder(View itemView) {
            super(itemView);
            img1 = (ImageView) itemView.findViewById(R.id.img1);
        }
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cover_flow,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder viewHolder, int position) {
        if(viewHolder.img1 != null)
            viewHolder.img1.setImageResource(images[position]);
    }

    @Override
    public int getCount() {
        return images.length;
    }


}
