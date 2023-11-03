package com.example.placement_ready.HelperClasses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.placement_ready.R;

public class SliderAdepter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdepter(Context context) {
        this.context = context;
    }
    int[] images ={
            R.drawable.fvdcs,
            R.drawable.dcm,
            R.drawable.pngegg
    };
    int[] heading={
            R.string.onbording_hed1,
            R.string.onbording_hed2,
            R.string.onbording_hed3
    };
    int[] description={
            R.string.onbording_des1,
            R.string.onbording_des2,
            R.string.onbording_des3,
    };

    public void ViewPagerAdapter(Context context){

        this.context = context;

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slides_layout,container,false);

        ImageView ImageView= view.findViewById(R.id.slider_image);
        TextView head=view.findViewById(R.id.slider_heading);
        TextView desc= view.findViewById(R.id.slider_desc);



        ImageView.setImageResource(images[position]);
        head.setText(heading[position]);
        desc.setText(description[position]);

        container.addView(view);

        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((LinearLayout)object);

    }
}
