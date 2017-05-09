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

public class PostFragment  extends Fragment {

    private ArrayList<ModelDiscover> modelDiscoverArrayList = new ArrayList<ModelDiscover>();
    private RecyclerView recyclerView;
    private int flag = 0;
    private PostFragment frag;

    public PostFragment newInstance(int val) {

        frag = new PostFragment();
        Bundle b = new Bundle();
        b.putInt("POST_MODE", val);

        frag.setArguments(b);

        return frag;
    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.recycle_view_discover, container, false);


        if (flag == 0) {
            ModelDiscover modelClass0 = new ModelDiscover(R.drawable.paris, "P A R I S");
            modelDiscoverArrayList.add(modelClass0);


            ModelDiscover modelClass1 = new ModelDiscover(R.drawable.paris, "P A R I S");
            modelDiscoverArrayList.add(modelClass1);


            ModelDiscover modelClass2 = new ModelDiscover(R.drawable.paris, "P A R I S");
            modelDiscoverArrayList.add(modelClass2);

            flag = 1;
        }
        DiscoverAdapter discoverAdapter = new DiscoverAdapter(modelDiscoverArrayList, getArguments().getInt("POST_MODE"));
        recyclerView = (RecyclerView) view.findViewById(R.id.rvItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(discoverAdapter);
        recyclerView.setHasFixedSize(true);
        return view;
    }
}
