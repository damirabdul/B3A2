package foo.bar;

/**
 * Created by Дамир on 13.06.14.
 */
public class Person implements Sleeping {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.println(name +" is sleeping");
    }
}
