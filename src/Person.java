public class Person {

    //Thuoc tinh (fields, attributes)
    private String name;
    private int age;
    private String className;

    //Hanh vi/Phuong thuc (methods)

    /**
     * Get Name : Return name
     * @return name
     */
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void memberOf(String className) {
        this.className = className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    String getClassName() {
        return className;
    }

    //overloading
    //2 tham so
    void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }

    //Cung so luong tham so, khac thu tu
    void setInfo(int age, String name) {
//        setName(name);
//        setAge(age);

        setInfo(name, age);
    }

    //overloading
    //3 tham so
    void setInfo(String firstName, String lastName, int age) {
        setName(firstName + " " + lastName);
        setAge(age);
    }

    //khac kieu
    void setInfo(String firstName, String lastName, short age) {
        setName(firstName + " " + lastName);
        setAge(age);
    }

    String getRoleAccess() {
        return "Person";
    }
}
