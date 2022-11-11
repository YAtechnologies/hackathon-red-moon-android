package com.yassir.yassirpartner;

public class Offer {

    public String title;
    public String date;
    public String priceRange;
    public boolean completed;
    public boolean newUpdate;
    public boolean newOrder;
    public boolean canceled;
    public boolean ongoing;

    public Offer(String title, String date, String priceRange, boolean completed, boolean newUpdate, boolean newOrder, boolean canceled, boolean ongoing) {
        this.title = title;
        this.date = date;
        this.priceRange = priceRange;
        this.completed = completed;
        this.newUpdate = newUpdate;
        this.newOrder = newOrder;
        this.canceled = canceled;
        this.ongoing = ongoing;
    }
}
