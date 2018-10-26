package com.library;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AdapterReMain extends RecyclerView.Adapter<ViewHolderMain> {
    Context context ;
    ArrayList<ItemRecMain> mains;

    public AdapterReMain(Context context, ArrayList<ItemRecMain> mains) {
        this.context = context;
        this.mains = mains;
    }

    @NonNull
    @Override
    public ViewHolderMain onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.rec_books,null);
        return new ViewHolderMain(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMain viewHolderMain, int i) {
        viewHolderMain.category.setText(mains.get(i).getCategroy());
        viewHolderMain.recyclerBooks.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        viewHolderMain.recyclerBooks.setAdapter(mains.get(i).getAdapterReBooks());
    }

    @Override
    public int getItemCount() {
        return mains.size();
    }
}