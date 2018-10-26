package com.library;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ViewHolderMain extends RecyclerView.ViewHolder {
    TextView category;
    RecyclerView recyclerBooks;
    public ViewHolderMain(@NonNull View itemView) {
        super(itemView);
        category = itemView.findViewById(R.id.category);
        recyclerBooks = itemView.findViewById(R.id.RecyclerViewBooks);
    }
}
