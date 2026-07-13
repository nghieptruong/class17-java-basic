import java.util.Arrays;
import java.util.List;

public class DemoOOP {
    public static void main(String[] args) {
//        //1. Encapsulation (tinh dong goi)
//        //Khoi tao 1 doi tuong Person
//        Person p1 = new Person();
//        p1.setName("Tom");
//        p1.setAge(30);
//
//        //In ra thuoc tinh name va age
//        String name = p1.getName();
//        int age = p1.getAge();
//        System.out.println("Name = " + name);
//        System.out.println("Age = " + age);
//
//        System.out.println("--------------------");
//
//        //2. Inheritance (tinh ke thua)
//        //Khoi tao 1 doi tuong Student
//        Student s1 = new Student();
//        s1.setName("Alice");
//        s1.setAge(23);
//
//        System.out.println("Name = " + s1.getName());
//        System.out.println("Age = " + s1.getAge());
//
//        s1.memberOf("Testing17");
//        System.out.println(s1.getClassName());
//
//        s1.setAvgGrade(8.5);
//        System.out.println(s1.getAvgGrade());
//
//        //3. Polimorphism (tinh da hinh)
//        //Overloading (da hinh luc compile time) - nạp chồng
//        //  - 1.Ten ham phai giong nhau
//        //  - 2.Ham phai khac tham so:
//        //      * Khac kieu
//        //      * Khac so luong tham so
//        //      * Cung so luong tham so, khac thu tu tham so
//        Student s2 = new Student();
//        s2.setInfo("Thomas", "Edition", 23);
//        System.out.println(s2.getName());
//        System.out.println(s2.getAge());
//
//        //Overriding (da hinh luc run time) - viết lại
//        System.out.println(s2.getRoleAccess()); // Person or Student ???
//
//        System.out.println("------------");
//        //Upcasting
//        Person p2 = new Student(); //upcasting
//        p2.setInfo("Tim", 24);
//        System.out.println(p2.getName());
//        System.out.println(p2.getAge());
//
//        //downcasting: ep kieu cha --> ve con --> muc dich: goi dc phuong thuc rieng cua con
//        ((Student) p2).setAvgGrade(7.5);
//        double avg = ((Student) p2).getAvgGrade();
//        System.out.println(avg);

        /*
            A university build a system to manage teachers and students:
            System already built Class Person, Class Students (ke thua tu Person)
            1. Tao 1 class Teacher (ke thua tu Person)
            2. Trong class Teacher: tao 1 thuoc tinh List lessons, 1 phuong thuc void setTeachingLessons(List lessons)
            3. Trong class ManageService: tao 1 phuong thuc void printInfoObjects nhan vao tham so la 1 list
                                    co chuc nang in ra name, age, className cua tat ca Student hoac tat ca Teacher
            Vi du:
                Student s1 = new Student()
                // set thong tin cho s1 (name, age, class)
                Student s2 = new Student()
                // set thong tin cho s2 (name, age, class)
                Teacher t1 = new Teacher()
                // set thong tin cho t1 (name, age, class)
                Teacher t2 = new Teacher()
                // set thong tin cho t2 (name, age, class)
                List allPersons: add het thong tin s1, s2, t1, t2
                printInfoObjects(allPersons)
                Ket qua:
                    Tom - 23 - Testing17
                    Thomas - 23 - Testing17
                    Henry - 56 - Testing17
                    Anna - 46 - Testing17
         */
        Student s1 = new Student();
        s1.setName("Tom");
        s1.setAge(23);
        s1.setClassName("Testing17");

        Student s2 = new Student();
        s2.setName("Thomas");
        s2.setAge(25);
        s2.setClassName("Testing17");

        Teacher t1 = new Teacher();
        t1.setName("Henry");
        t1.setAge(50);
        t1.setClassName("Testing17");

        Teacher t2 = new Teacher();
        t2.setName("Anna");
        t2.setAge(60);
        t2.setClassName("Testing17");

        ManageService ms = new ManageService();

        // Cach 1: Arrays.asList()
        // Cach 2: infoObjects = new ArrayList()
        //           infoObjects.add()
        // Cach 3:
        List<String> infoObjects = List.of(
                s1.getName() + " - " + s1.getAge() + " - " + s1.getClassName(),
                s2.getName() + " - " + s2.getAge() + " - " + s2.getClassName(),
                t1.getName() + " - " + t1.getAge() + " - " + t1.getClassName(),
                t2.getName() + " - " + t2.getAge() + " - " + t2.getClassName()
        );

        ms.printInfoObject(infoObjects);

    }
}
