package com.example.placement_ready.User;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.placement_ready.HelperClasses.Homeadepter.mostviewed_Adepter;
import com.example.placement_ready.HelperClasses.Homeadepter.mostviewed_helperClass;
import com.example.placement_ready.HelperClasses.Homeadepter.test_Adepter;
import com.example.placement_ready.HelperClasses.Homeadepter.test_helperClass;
import com.example.placement_ready.HelperClasses.Homeadepter.videos_Adepter;
import com.example.placement_ready.R;
import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView mostviewed_recylerView,videos_recylerView,test_recylerView;
    RecyclerView.Adapter adapter;






    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        mostviewed_recylerView=view.findViewById(R.id.mostviewed_recylerView);
        videos_recylerView=view.findViewById(R.id.videos_recylerView);
        test_recylerView=view.findViewById(R.id.test_recylerView);
        videos_recylerView();
        mostviewed_recylerView();
        test_recylerView();
        return view;


    }

    private void test_recylerView() {
        test_recylerView.setHasFixedSize(true);
        test_recylerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,false));

        ArrayList<test_helperClass> testlocation=new ArrayList<>();
        testlocation.add(new test_helperClass(R.drawable.chartimg,"sfsf"));
        testlocation.add(new test_helperClass(R.drawable.cards,"kdfkd"));
        testlocation.add(new test_helperClass(R.drawable.cards,"kdfkd"));
        testlocation.add(new test_helperClass(R.drawable.cards,"kdfkd"));
        testlocation.add(new test_helperClass(R.drawable.cards,"kdfkd"));

        adapter = new test_Adepter(testlocation);
        test_recylerView.setAdapter(adapter);
    }

    private void videos_recylerView() {
        videos_recylerView.setHasFixedSize(true);
        videos_recylerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false));

        ArrayList<mostviewed_helperClass> videoslocation=new ArrayList<>();
        videoslocation.add(new mostviewed_helperClass(R.drawable.chartimg,"sfsf","React"));
        videoslocation.add(new mostviewed_helperClass(R.drawable.cards,"kdfkd","Node js"));
        videoslocation.add(new mostviewed_helperClass(R.drawable.cards,"kdfkd","Flutter"));
        videoslocation.add(new mostviewed_helperClass(R.drawable.cards,"kdfkd","Java"));
        videoslocation.add(new mostviewed_helperClass(R.drawable.cards,"kdfkd","Php"));

        adapter = new videos_Adepter(videoslocation);
        videos_recylerView.setAdapter(adapter);
    }

    private void mostviewed_recylerView() {
        mostviewed_recylerView.setHasFixedSize(true);
        mostviewed_recylerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false));

        ArrayList<mostviewed_helperClass> mostviewedlocation=new ArrayList<>();
        mostviewedlocation.add(new mostviewed_helperClass(R.drawable.btn1,"Test 1","dfghjkkfdffgf dgfhjkfgjgjgghjgjghghf fccgcccfghgh"));
        mostviewedlocation.add(new mostviewed_helperClass(R.drawable.cards,"kdfkd","dfsfsfsdfs"));
        mostviewedlocation.add(new mostviewed_helperClass(R.drawable.cards,"kdfkd","dfsfsfsdfs"));
        mostviewedlocation.add(new mostviewed_helperClass(R.drawable.cards,"kdfkd","dfsfsfsdfs"));
        mostviewedlocation.add(new mostviewed_helperClass(R.drawable.cards,"kdfkd","dfsfsfsdfs"));


        adapter = new mostviewed_Adepter(mostviewedlocation);
        mostviewed_recylerView.setAdapter(adapter);

    }


}