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

public class videos_Adepter extends RecyclerView.Adapter<videos_Adepter.vidoesholder> {
    ArrayList<mostviewed_helperClass> vidoeslocation;

    public videos_Adepter(ArrayList<mostviewed_helperClass> vidoeslocation) {
        this.vidoeslocation = vidoeslocation;
    }

    @NonNull
    @Override
    public videos_Adepter.vidoesholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.videos_card_design, parent, false);
        videos_Adepter.vidoesholder vidoesholder = new videos_Adepter.vidoesholder(view);
        return vidoesholder;
    }

    @Override
    public void onBindViewHolder(@NonNull vidoesholder holder, int position) {
        mostviewed_helperClass vidoes_helperClass = vidoeslocation.get(position);
        holder.image.setImageResource(vidoes_helperClass.getImage());
        holder.title.setText(vidoes_helperClass.getTitle());
        holder.desc.setText(vidoes_helperClass.getDiscreption());

    }



    @Override
    public int getItemCount() {
        return vidoeslocation.size();
    }

    public static class vidoesholder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title, desc;

        public vidoesholder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.videos_image);
            title = itemView.findViewById(R.id.videos_title);
            desc = itemView.findViewById(R.id.videos_desc);

        }
    }
}