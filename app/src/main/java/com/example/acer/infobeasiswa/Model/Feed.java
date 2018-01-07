//Dikerjakan oleh Pramita Khaerunisa

package com.example.acer.infobeasiswa.Model;

/**
 * Created by acer on 05/01/2018.
 */

public class Feed
{
    public String url;
    public String title;
    public String link;
    public String author;
    public String description;
    public String image;

    public Feed(String url, String title, String link, String author, String description, String image) {
        this.url = url;
        this.title = title;
        this.link = link;
        this.author = author;
        this.description = description;
        this.image = image;
    }
}