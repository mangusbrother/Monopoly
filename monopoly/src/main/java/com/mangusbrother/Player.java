package com.mangusbrother;

import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author samanthacatania
 * @since 15/01/2016.
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

    public void buy(Property p) throws InsufficientFundsException {
        if (balance < p.getPrice())
            throw new InsufficientFundsException(p.getPrice() - balance);

        decrementBalance(p.getPrice());
        property.add(p);
    }

    public void buyAuction(Property p, double price) throws InsufficientFundsException {
        if (balance < price)
            throw new InsufficientFundsException(price - balance);

        decrementBalance(price);
        property.add(p);
    }

    public void sellAuction(Property p, double price) {
        incrementBalance(price);
        property.remove(p);
    }

    public void payRent(double rent) throws InsufficientFundsException {
        if (balance < rent)
            throw new InsufficientFundsException(rent - balance);

        decrementBalance(rent);
    }
}
