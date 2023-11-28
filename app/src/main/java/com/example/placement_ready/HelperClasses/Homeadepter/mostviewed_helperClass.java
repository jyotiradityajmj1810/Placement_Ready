package com.example.placement_ready.HelperClasses.Homeadepter;

public class mostviewed_helperClass {

    int image;
    String title,discreption;
    public mostviewed_helperClass(int image, String title, String discreption) {
        this.image = image;
        this.title = title;
        this.discreption = discreption;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDiscreption() {
        return discreption;
    }


    public String getYourData() {
        return discreption;
    }
}
