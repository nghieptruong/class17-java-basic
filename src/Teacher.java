import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private List<String> lessons = new ArrayList<>();

    public Teacher() {

    }

    public Teacher(String name, int age, String className) {
        super(name, age, className);
    }

    void setTeachingLessons(List lessons) {
        this.lessons = lessons;
    }

    List getLessons() {
        return lessons;
    }
}
