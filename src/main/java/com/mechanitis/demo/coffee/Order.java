package com.mechanitis.demo.coffee;

import org.mongodb.morphia.annotations.Id;

public class Order {
    //    {
    //        "type": {
    //            "name": "Americano",
    //            "family": "Coffee"
    //        },
    //        "size": "Medium",
    //        "drinker": "Trisha",
    //        "coffeeShopId": 1
    //    }

    @Id
    private String id;
    private String drinker;
    private String size;
    private String[] selectedOptions;
    private long coffeeShopId;
    private DrinkType type;

    public String getId() {
        return id;
    }

    public String getDrinker() {
        return drinker;
    }

    public String getSize() {
        return size;
    }

    public String[] getSelectedOptions() {
        return selectedOptions;
    }

    public long getCoffeeShopId() {
        return coffeeShopId;
    }

    public DrinkType getType() {
        return type;
    }

}
