package ca.squall.cupboard;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by charles on 2016-09-21.
 */

public class Food extends SugarRecord {
    String name;
    Boolean haveSome;
    Boolean wantSome;

    public Food() {
    }

    public Food(String name, Boolean haveSome, Boolean wantSome) {
        this.name = name;
        this.haveSome = haveSome;
        this.wantSome = wantSome;
    }

    public static List<Food> listAll() {
        return Food.listAll(Food.class);
    }

    public static List<Food> listAllStocked() {
        return Food.find(Food.class, "have_some = ?", "1");
    }

    public static List<Food> listAllWanted() {
        return Food.find(Food.class, "want_some = ?", "1");
    }
}
