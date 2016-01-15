package com.mangusbrother;

import lombok.Data;

import java.util.List;

/**
 * Created by samanthacatania on 15/01/2016.
 */
@Data
public class Player {
    int position;

    double balance = 1500;
    List<Property> property;

    boolean jailed;
    List<Card> jail;

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
}
