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
import com.example.gaurav.ibilive.modelDiscover.ModelNetwork;
import com.example.gaurav.ibilive.recyclerViewAdapter.NetworkAdapter;

import java.util.ArrayList;

/**
 * Created by gaurav on 4/5/17.
 */

public class NetworkFragment extends Fragment {
    private ArrayList<ModelNetwork> networks;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_networks, container, false);
        networks = new ArrayList<ModelNetwork>();
        networks.add(new ModelNetwork("EVelyn"));
        networks.add(new ModelNetwork("EVelyn"));
        networks.add(new ModelNetwork("EVelyn"));
        networks.add(new ModelNetwork("EVelyn"));
        networks.add(new ModelNetwork("EVelyn"));
        networks.add(new ModelNetwork("EVelyn"));
        NetworkAdapter recyclerViewAdapter = new NetworkAdapter(networks, getContext());
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_network);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return view;


    }
}


