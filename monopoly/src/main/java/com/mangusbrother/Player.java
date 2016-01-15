package com.mangusbrother;

import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by samanthacatania on 15/01/2016.
 */
@Data
public class Player {
    private int position;

    private double balance = 1500;
    private List<Property> property;

    private boolean jailed;
    private List<Card> jail;

    public double incrementBalance(double toAdd) {
        balance += toAdd;
        return balance;
    }

    public double decrementBalance(double toDeduct) {
        balance -= toDeduct;
        return balance;
    }

    // Use Spring Retry?
    public double payPlayer(Player otherPlayer, double amount) throws InsufficientFundsException {
        if (balance < amount)
            throw new InsufficientFundsException(amount - balance);
        decrementBalance(amount);
        otherPlayer.incrementBalance(amount);
        return balance;
    }

    public List<Property> getGroup(Property.PropertyType type) {
        return property.stream().filter(p -> p.getType() == type).collect(Collectors.toList());
    }
}
