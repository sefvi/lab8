package vn.sefviapp.lab8.Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import vn.sefviapp.lab8.Muc;
import vn.sefviapp.lab8.MyAdapter;
import vn.sefviapp.lab8.R;

public class Bai2Fragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Muc> mucArrayList;
    MyAdapter myAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("WrongConstant")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_bai2, container, false);
        recyclerView = v.findViewById(R.id.reView);
        mucArrayList = new ArrayList<>();
        mucArrayList.add(new Muc(R.drawable.danang, "Đà Nẵng"));
        mucArrayList.add(new Muc(R.drawable.quynhon, "Quy Nhơn"));
        mucArrayList.add(new Muc(R.drawable.sapa, "SaPa"));
        mucArrayList.add(new Muc(R.drawable.vinhhalong, "Vịnh Hạ Long"));
        myAdapter = new MyAdapter(getContext(),mucArrayList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext().getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(myAdapter);
        return v;
    }


}
