package com.example.kiemtra.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kiemtra.R;
import com.example.kiemtra.adapter.RecycleViewAdapter;
import com.example.kiemtra.database.SQLiteHelper;

public class FragmentSearch extends Fragment implements View.OnClickListener {

    public RecyclerView recyclerView;
    private TextView tvThongKe;
    private SearchView search;


    private RecycleViewAdapter adapter;
    private SQLiteHelper db;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
    }

    @Override
    public void onClick(View view) {

    }
}
