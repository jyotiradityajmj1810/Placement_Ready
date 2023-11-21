package com.example.placement_ready.User;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.placement_ready.R;

public class ResoursesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_resourses, container, false);
        Button startNewActivityButton = rootView.findViewById(R.id.start);

        // Set OnClickListener for the button
        startNewActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click
                nextScreen(v);  // Pass the View parameter
            }
        });
        return rootView;
    }

    private void nextScreen(View view) {
        Log.d("Button Click", "Button clicked!");
        Intent intent = new Intent(getActivity(), Resource_video.class);
        startActivity(intent);
        requireActivity().finish();
    }


}
