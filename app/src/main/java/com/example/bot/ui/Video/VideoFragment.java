package com.example.bot.ui.Video;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bot.R;

import java.util.ArrayList;

public class VideoFragment extends Fragment {

    private RecyclerView recyclerView;
    ArrayList<DataSetList> arrayList;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.video_fragment, container, false);


        recyclerView=view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        arrayList=new ArrayList<DataSetList>();

        DataSetList dataSetList=new DataSetList("https://www.youtube.com/watch?v=RBUbja6V9Aw");
        arrayList.add(dataSetList);

        dataSetList=new DataSetList("https://www.youtube.com/watch?v=RBUbja6V9Aw");
        arrayList.add(dataSetList);

        dataSetList=new DataSetList("https://www.youtube.com/watch?v=RBUbja6V9Aw");
        arrayList.add(dataSetList);


        YoutubeAdapter youtubeAdapter=new YoutubeAdapter(arrayList,getContext());
        recyclerView.setAdapter(youtubeAdapter);


        return view;
    }




}