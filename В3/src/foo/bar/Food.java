package foo.bar;

/**
 * Created by Дамир on 13.06.14.
 */
public class Food {

    private String name;
    private String recept;

    public Food(String name, String recept) {
        this.name = name;
        this.recept = recept;
    }

    public String getName() {
        return name;
    }

    public String getRecept() {
        return recept;
    }
}
