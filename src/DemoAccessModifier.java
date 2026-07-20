public class DemoAccessModifier {
    public static void main(String[] args) {
        Person p = new Person();

        //thuoc tinh name cua Person
        // dang o che do default
        //DemoAccessModifier va Person dang
        //trong cung package src
        p.name = "John";
    }
}
