package foo.bar;

import java.util.List;

/**
 * Created by Дамир on 13.06.14.
 */
public class FullPerson extends Person implements Eating{

    protected List<Food> preferFood;

    public FullPerson(String name) {
        super(name);
    }

    public void setPreferFood(List<Food> preferFood) {
        this.preferFood = preferFood;
    }

    @Override
    public  void eat(Food food) {
        System.out.println("Eating "+food.getName());
    }
}
