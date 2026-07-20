public class Person2 {

    //Thuoc tinh (fields, attributes)
    String name;
    private int age;
    private String className;

    public Person2() {

    }

    public Person2(String name, int age, String className) {
        this.name = name;
        this.age = age;
        this.className = className;
    }

    //Hanh vi/Phuong thuc (methods)

    /**
     * Get Name : Return name
     * @return name
     */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void memberOf(String className) {
        this.className = className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    //overloading
    //2 tham so
    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }

    //Cung so luong tham so, khac thu tu
    public void setInfo(int age, String name) {
//        setName(name);
//        setAge(age);

        setInfo(name, age);
    }

    //overloading
    //3 tham so
    public void setInfo(String firstName, String lastName, int age) {
        setName(firstName + " " + lastName);
        setAge(age);
    }

    //khac kieu
    public void setInfo(String firstName, String lastName, short age) {
        setName(firstName + " " + lastName);
        setAge(age);
    }

    public String getRoleAccess() {
        return "Person";
    }
}
