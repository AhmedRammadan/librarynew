package com.library;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

class ViewHolderBooks extends RecyclerView.ViewHolder {
    TextView title ,size ;
    ImageView imgbook;
    public ViewHolderBooks(@NonNull View itemView) {
        super(itemView);
        size = itemView.findViewById(R.id.size);
        title = itemView.findViewById(R.id.title);
        imgbook = itemView.findViewById(R.id.imgbook);
    }
}
