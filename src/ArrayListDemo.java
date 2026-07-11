import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        //khai bao array list
        ArrayList<Integer> arrList = new ArrayList<>();

        //In ra size (kich thuoc)
        System.out.println(arrList.size()); // 0

        //Add phan tu dau tien
        arrList.add(1);

        //In ra size (kich thuoc)
        System.out.println(arrList.size()); // 1

        //Truy cap phan tu
        System.out.println(arrList.get(0)); // ???

        //Add them phan tu khac
        arrList.add(10);

        //In ra het
        System.out.println(arrList); // [1, 10]

        //Remove phan tu so 10 (tai index 1)
        arrList.remove(1);

        //In ra het
        System.out.println(arrList); // [1]

        //Cho phep trung lap gia tri
        arrList.add(1);

        //In ra het
        System.out.println(arrList); // [1, 1]

        //Duyet array list
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }

        System.out.println("--------------------");
        //Duyet array list bang for each
//        for (Integer i : arrList) {
//            System.out.println(i);
//        }

        for (int i : arrList) {
            System.out.println(i);
        }

        System.out.println("---------------");
        // Duyet bang doi tuong iterator
        Iterator<Integer> iter = arrList.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
