package foo.bar;

import java.util.List;

/**
 * Created by Дамир on 13.06.14.
 */
public class FullStudent extends FullPerson implements Studying {

    private List<Subject> preferSubjects;

    public FullStudent(String name) {
        super(name);
    }

    public void setPreferSubjects(List<Subject> preferSubjects) {
        this.preferSubjects = preferSubjects;
    }

    @Override
    public void study() {

    }
}
