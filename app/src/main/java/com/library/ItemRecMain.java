package com.library;

public class ItemRecMain {
    private String categroy;
   private AdapterReBooks adapterReBooks ;

    public ItemRecMain(String categroy, AdapterReBooks adapterReBooks) {
        this.categroy = categroy;
        this.adapterReBooks = adapterReBooks;
    }

    public String getCategroy() {
        return categroy;
    }

    public AdapterReBooks getAdapterReBooks() {
        return adapterReBooks;
    }
}
