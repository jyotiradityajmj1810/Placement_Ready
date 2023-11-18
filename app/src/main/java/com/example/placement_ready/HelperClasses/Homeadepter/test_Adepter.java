package com.example.placement_ready.HelperClasses.Homeadepter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.placement_ready.R;

import java.util.ArrayList;

public class test_Adepter extends RecyclerView.Adapter<test_Adepter.testholder> {

    ArrayList<test_helperClass> testlocation;

    public test_Adepter(ArrayList<test_helperClass> testlocation) {
        this.testlocation = testlocation;
    }

    @NonNull
    @Override
    public testholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_card_design,parent,false);
        testholder testholder =new testholder(view);
        return testholder;
    }

    @Override
    public void onBindViewHolder(@NonNull testholder holder, int position) {
        test_helperClass test_helperClass=testlocation.get(position);
        holder.image.setImageResource(test_helperClass.getImage());
        holder.title.setText(test_helperClass.getTitle());

    }

    @Override
    public int getItemCount() {
        return testlocation.size();
    }

    public static class testholder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title;
        public testholder(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.test_image);
            title=itemView.findViewById(R.id.test_title);

        }
    }

}
