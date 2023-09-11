package com.example.custom_recycler_view_practice;

public class Photo {
    private int localUrl;
    private String imageUrl;
    private String title;
    private String description;


    public Photo(String imageUrl, String title, String description) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.description = description;
    }

    public Photo(int localUrl, String title, String description) {
        this.localUrl = localUrl;
        this.title = title;
        this.description = description;
    }

    public int getLocalUrl() {
        return localUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
