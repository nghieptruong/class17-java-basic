import java.util.ArrayList;
import java.util.List;

public class DemoOOP2 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        List<Teacher> teachersList = new ArrayList<>();

        Student s1 = new Student();
        s1.setName("Tom");
        s1.setAge(23);
        s1.setClassName("Testing17");

        Student s2 = new Student();
        s2.setName("Thomas");
        s2.setAge(25);
        s2.setClassName("Testing17");

        studentList.add(s1);
        studentList.add(s2);

        Teacher t1 = new Teacher();
        t1.setName("Henry");
        t1.setAge(50);
        t1.setClassName("Testing17");

        Teacher t2 = new Teacher();
        t2.setName("Anna");
        t2.setAge(60);
        t2.setClassName("Testing17");

        teachersList.add(t1);
        teachersList.add(t2);

        ManageService2 m = new ManageService2();
        m.printsInfoClass(studentList);
        m.printInfoClass(teachersList);

    }
}
