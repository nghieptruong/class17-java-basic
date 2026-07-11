import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> setStr = new HashSet<>();
        setStr.add("Anna");
        setStr.add("Peter");
        setStr.add("Tom");
        setStr.add("Tom");

        //In ra set
        System.out.println(setStr);

        //Remove gia tri
        setStr.remove("Tom");

        //In ra set
        System.out.println(setStr);

    }
}
