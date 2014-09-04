package foo.bar;

import java.util.List;

/**
 * Created by Дамир on 13.06.14.
 */
public class Student extends Person implements Studying {

    private List<Subject> preferSubjects;

    public Student(String name) {
        super(name);
    }

    public List<Subject> getPreferSubjects() {
        return preferSubjects;
    }

    public void setPreferSubjects(List<Subject> preferSubjects) {
        this.preferSubjects = preferSubjects;
    }

    @Override
    public void study() {

    }
}
