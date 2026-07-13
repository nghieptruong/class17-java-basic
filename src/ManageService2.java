import java.util.List;

public class ManageService2 {

    //Tao 2 function
    //Ko lam overloading

    public void printsInfoClass(List<Student> studentList) {
        for (Student s : studentList) {
            System.out.println(s.getName());
            System.out.println(s.getAge());
            System.out.println(s.getAvgGrade());
        }
    }
    public void printInfoClass(List<Teacher> teachersList){
        for (Teacher t : teachersList){
            System.out.println(t.getName());
            System.out.println(t.getAge());
            System.out.println(t.getLessons());
        }
    }
}
