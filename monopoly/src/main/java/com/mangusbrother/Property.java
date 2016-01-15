package com.mangusbrother;

import lombok.Data;

/**
 * Created by samanthacatania on 15/01/2016.
 */
@Data
public abstract class Property {
    private Player owner;

    private String name;
    private double price;
    private PropertyType type;
    private boolean mortgaged;
    private double mortgagePrice;

    public Property(String name, double price, PropertyType type, double mortgagePrice) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.mortgagePrice = mortgagePrice;

        owner = null;
        mortgaged = false;

    }

    public abstract double calculateRent(int dice);

    public enum PropertyType {
        UTILITY, STATION, BROWN, BLUE, PINK, ORANGE, RED, YELLOW, GREEN, PURPLE
    }
}

