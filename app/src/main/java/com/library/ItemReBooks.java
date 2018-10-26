package com.library;

public class ItemReBooks {
    private int image ;
    private String title,size;

    public ItemReBooks(int image, String title, String size) {
        this.image = image;
        this.title = title;
        this.size = size;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getSize() {
        return size;
    }
}
