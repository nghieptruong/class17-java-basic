import java.util.ArrayList;

public class DemoOOP3 {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setInfo("Tom", 23);
        st1.memberOf("Testing17");
        Student st2 = new Student();
        st2.setInfo("Thomas", 23);
        st2.memberOf("Testing17");
        Teacher t1 = new Teacher();
        t1.setInfo("Henry", 56);
        t1.memberOf("Testing17");
        Teacher t2 = new Teacher();
        t2.setInfo("Anna", 46);
        t2.memberOf("Testing17");

        ArrayList<Person> allPersons = new ArrayList<>();
        allPersons.add(st1);
        allPersons.add(st2);
        allPersons.add(t1);
        allPersons.add(t2);

        ManageService3 mana = new ManageService3();
        mana.printInfoObjects(allPersons);
    }
}
