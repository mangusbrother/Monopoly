package com.mangusbrother;

import lombok.Data;

/**
 * Created by samanthacatania on 15/01/2016.
 */
@Data
public class Player {
    double balance;
    List<Property> property;

    boolean jailed;
    List<Card> jail;
}
