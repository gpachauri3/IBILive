package com.example.gaurav.ibilive.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gaurav.ibilive.R;
import com.example.gaurav.ibilive.modelDiscover.ModelDiscover;
import com.example.gaurav.ibilive.recyclerViewAdapter.DiscoverAdapter;

import java.util.ArrayList;

/**
 * Created by gaurav on 4/5/17.
 */

public class DiscoverFragment extends Fragment {
    private ArrayList<ModelDiscover> modelDiscoverArrayList = new ArrayList<ModelDiscover>();
    private RecyclerView recyclerView;
    private int flag = 0;
    private DiscoverFragment frag;


    public DiscoverFragment newInstance(int val) {

        frag = new DiscoverFragment();
        Bundle b = new Bundle();
        b.putInt("DISCOVER_MODE", val);

        frag.setArguments(b);

        return frag;
    }


    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycle_view_discover, container, false);

        if (flag == 0) {
            ModelDiscover modelClass0 = new ModelDiscover(R.drawable.paris, "Lorem ipsum dolor sit amet, consectetur lorem ipsum dolor sit amet, consectetur lorem ipsum.");
            modelDiscoverArrayList.add(modelClass0);


            ModelDiscover modelClass1 = new ModelDiscover(R.drawable.paris, "Lorem ipsum dolor sit amet, consectetur lorem ipsum dolor sit amet, consectetur lorem ipsum.");
            modelDiscoverArrayList.add(modelClass1);


            ModelDiscover modelClass2 = new ModelDiscover(R.drawable.paris, "Lorem ipsum dolor sit amet, consectetur lorem ipsum dolor sit amet, consectetur lorem ipsum.");
            modelDiscoverArrayList.add(modelClass2);


            flag = 1;
        }
        DiscoverAdapter discoverAdapter = new DiscoverAdapter(modelDiscoverArrayList, getArguments().getInt("DEFAULT_MODE"));
        recyclerView = (RecyclerView) view.findViewById(R.id.rvItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(discoverAdapter);
        recyclerView.setHasFixedSize(true);
        return view;
    }
}

