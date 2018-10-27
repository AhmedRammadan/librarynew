package com.library;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterReBooks extends RecyclerView.Adapter<ViewHolderBooks> {
    Context context;
    ArrayList<ItemReBooks> books;

    public AdapterReBooks(Context context, ArrayList<ItemReBooks> books) {
        this.context = context;
        this.books = books;
    }

    @NonNull
    @Override
    public ViewHolderBooks onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.cardview,null);
        return new ViewHolderBooks(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderBooks viewHolderBooks, int i) {
        viewHolderBooks.size.setText(books.get(i).getSize());
        viewHolderBooks.title.setText(books.get(i).getTitle());
        Picasso.get().load(books.get(i).getIamge()).into(viewHolderBooks.imgbook);
    }

    @Override
    public int getItemCount() {
        return books.size();
    }
}
