import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private List<String> lessons = new ArrayList<>();

    void setTeachingLessons(List lessons) {
        this.lessons = lessons;
    }

    List getLessons() {
        return lessons;
    }
}
