package com.example.finalprojesi;

public class Advertise {

    private int id;
    private String category;
    private String type;
    private String adress;
    private String price;
    private String room;
    private String size;

    public Advertise(){}


    public Advertise(int id, String category, String type, String adress, String price, String room, String size) {
        this.id = id;
        this.category = category;
        this.type = type;
        this.adress = adress;
        this.price = price;
        this.room = room;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
