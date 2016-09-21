package ca.squall.cupboard;

import com.orm.SugarRecord;

/**
 * Created by charles on 2016-09-21.
 */

public class Food extends SugarRecord {
    String name;

    public Food() {
    }

    public Food(String name) {
        this.name = name;
    }
}
