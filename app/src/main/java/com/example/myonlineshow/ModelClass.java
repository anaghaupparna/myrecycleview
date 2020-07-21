package com.example.myonlineshow;

public class ModelClass {
    int imageIcon;
    String tittle;
    String body;

    public ModelClass(int imageIcon, String tittle, String body) {
        this.imageIcon = imageIcon;
        this.tittle = tittle;
        this.body = body;
    }

    public int getImageIcon() {
        return imageIcon;
    }
    public String getTittle(){
        return tittle;
    }
    public String getBody(){
        return body;
    }
}
