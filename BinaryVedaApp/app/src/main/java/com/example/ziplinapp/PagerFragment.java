package com.example.ziplinapp;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class PagerFragment extends Fragment {

    RecyclerView recyclerView;

    private static final String TAG = "PagerFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycler_view, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        ImageAdapter imageAdapter = new ImageAdapter(getActivity());
        recyclerView.setAdapter(imageAdapter);
        Log.d(TAG, "onCreateView: ");
        return view;
    }
}
