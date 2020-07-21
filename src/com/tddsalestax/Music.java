package com.tddsalestax;

public class Music {

    private String name;
    private double price;

    public Music(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Music() {

    }


    public boolean checkMusicPrice(double musicPrice) {
        if(musicPrice == 14.99) {
        return true;
        }
        return false;
    }
}
