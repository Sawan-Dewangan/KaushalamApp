package com.skd.KaushalamApp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Calendar;
//Using this fragment for recyclerView.
    public class Profile_Fragment extends Fragment
    {
    private ArrayList<Rview_list> mexampleList;
    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        Calendar calendar = Calendar.getInstance();
        int minutes = calendar.get(Calendar.MINUTE);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        String s = (hours<10?"0"+hours: hours)+":"+(minutes<10?"0"+minutes:minutes);

        mexampleList = new ArrayList<>();
        mexampleList.add(new Rview_list( "Title", "Message", s));
        mexampleList.add(new Rview_list( "Title", "Message", s));
        mexampleList.add(new Rview_list( "Title", "Message", s));
        mexampleList.add(new Rview_list( "Title", "Message", s));
        mexampleList.add(new Rview_list( "Title", "Message", s));
        mexampleList.add(new Rview_list( "Title", "Message", s));
        mexampleList.add(new Rview_list( "Title", "Message", s));
        mexampleList.add(new Rview_list( "Title", "Message", s));
        mexampleList.add(new Rview_list( "Title", "Message", s));

        mRecyclerView = view.findViewById(R.id.mRecycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new ExampleAdapter(mexampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new ExampleAdapter.OnItemClickListener() {
            @Override
            public void onDeleteClick(int position) {
                removeItem(position);
            }
        });
        return view;
        }
        public void removeItem(int position)
        {
        mexampleList.remove(position);
        mAdapter.notifyItemRemoved(position);
        }
    }

