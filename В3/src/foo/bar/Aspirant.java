package foo.bar;

/**
 * Created by Дамир on 13.06.14.
 */
public class Aspirant extends Person implements Studying,Working {

    private String work;

    public Aspirant(String name) {
        super(name);
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public void study() {

    }

    @Override
    public void work() {

    }
}
