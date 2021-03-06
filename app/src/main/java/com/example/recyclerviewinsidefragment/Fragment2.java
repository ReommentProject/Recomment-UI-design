package com.example.recyclerviewinsidefragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Fragment2 extends Fragment {
    RecyclerView recyclerView;
    ArrayList images , name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment1, container, false);
        recyclerView=view.findViewById(R.id.recyclerView);
        images=new ArrayList();
        name=new ArrayList();
        for(int i=0;i<Data.names.length;i++)
        {
            images.add(Data.images);
            name.add(Data.names);
        }
        HelperAdapter helperAdapter=new HelperAdapter(getContext(),images,name);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(helperAdapter);
        return view;
    }
}


