public class Student extends Person {

    //Thuoc tinh rieng cua Student
    private double avgGrade;

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    //Overriding:
    //  1. Cung ten ham voi cha
    //  2. Cung tham so
    //  3. Pham vi truy cap (modifier access) >= cha
    @Override
    String getRoleAccess() {
        return "Student";
    }
}
