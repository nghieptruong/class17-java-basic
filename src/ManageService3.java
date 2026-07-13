import java.util.ArrayList;

public class ManageService3 {
    void printInfoObjects (ArrayList<Person> person)
    {
        for (Person p: person)
        {
            System.out.println(p.getName()+" - "+p.getAge()+" - "+ p.getClassName());
        }
    }
}
