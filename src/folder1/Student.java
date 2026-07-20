package folder1;

import folder2.Person;

public class Student extends Person {

    //Thuoc tinh rieng cua Student
    private double avgGrade;

    public Student() {
        super();
    }

    public Student(String name, int age, String className) {
        super(name, age, className);
    }

    public Student(String name, int age, String className, double avgGrade) {
        this(name, age, className);
        this.avgGrade = avgGrade;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
        getClassName();
    }

    //Overriding:
    //  1. Cung ten ham voi cha
    //  2. Cung tham so
    //  3. Pham vi truy cap (modifier access) >= cha
    @Override
    public String getRoleAccess() {
        return "Student";
    }
}
