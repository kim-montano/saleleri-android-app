package com.example.jumpyjump.domain.store;

import com.example.jumpyjump.domain.post.location.Location;
import com.example.jumpyjump.domain.post.offereditem.OfferedItem;
import com.example.jumpyjump.domain.post.user.User;
import com.example.jumpyjump.domain.store.brand.Brand;

public class Store {
    private Brand brand;
    private Location location;
    private OfferedItem[] offeredItems;
    private String[] imageUrls;
    private User user;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public OfferedItem[] getOfferedItems() {
        return offeredItems;
    }

    public void setOfferedItems(OfferedItem[] offeredItems) {
        this.offeredItems = offeredItems;
    }

    public String[] getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(String[] imageUrls) {
        this.imageUrls = imageUrls;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
