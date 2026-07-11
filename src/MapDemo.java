import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        //Khai bao hash map
        HashMap<Integer, String> map = new HashMap<>();

        // In ra size
        System.out.println(map.size()); // 0

        // Add 1 cap key-value
        map.put(1, "Hello");
        map.put(2, "Hi");

        // In ra map
        System.out.println(map);

        // Lay gia tri co key la so 1
        System.out.println(map.get(1)); // Hello

        // Add 1 key trung (key da co)
        map.put(1, "Xin Chao");

        // In ra map
        System.out.println(map);

        // Kiem tra key co ton tai hay khong
        System.out.println(map.containsKey(1));

        // Lay tat ca cac keys
        Set<Integer> keys = map.keySet();
        System.out.println(keys);

        // Lay tat ca cac values
        Collection<String> collection = map.values();
        System.out.println(collection);

        // Duyet map
        for(Integer k : keys) {
            System.out.println(k + " = " + map.get(k));
        }

        // Duyet map bang entry set
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for(Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Co 1 danh sach: Anna, Tom, Tom, Peter, Thomas, David, Anna ---> nghi toi list (ArrayList)
        // Dem so lan xuat hien cua moi cai ten (unique - duy nhat) --> nghi toi map
//                                    2 truong hop: neu co roi (dem roi --> co key): lay gia tri ra + 1
//                                                  ko co: xuat hien lan dau --> 1
        // Ket qua:
        // Anna = 1
        // Tom = 2
        // Peter = 1
        // Thomas = 1
//        Collection<String> name = new ArrayList<>(Arrays.asList("Anna", "Tom", "Tom", "Peter", "Thomas", "David", "Anna"));
//        Collection<String> name = Arrays.asList("Anna", "Tom", "Tom", "Peter", "Thomas", "David", "Anna");
//        HashMap<String, Integer> maps = new HashMap<>();
//        for(String n : name)
//            maps.put(n, maps.getOrDefault(n, 0) + 1 );
//        System.out.println(maps);

//        List<String> listName = Arrays.asList("Anna", "Tom", "Tom", "Peter", "Thomas", "David", "Anna");
//        HashMap<String, Integer> maps = new HashMap<>();
//        for(String name : listName) {
//            if(maps.containsKey(name)) {
//                int count = maps.get(name); // lay so hien co
//                count++;
//                maps.put(name, count);
//            } else {
//                maps.put(name, 1);
//            }
//        }
//        System.out.println(maps);

        ArrayList<String> arrList = new ArrayList<String>();
        String[] str = {"Anna", "Tom", "Peter", "Thomas", "David"};

        arrList.add("Anna");
        arrList.add("Tom");
        arrList.add("Tom");
        arrList.add("Peter");
        arrList.add("Thomas");
        arrList.add("David");
        arrList.add("Anna");

        for (int j = 0; j < str.length; j++) {
            int sum = 0;
            for (int i = 0; i < arrList.size(); i++) {
                if (Objects.equals(arrList.get(i), str[j])) {
                    sum++;
                }
            }
            System.out.println(str[j] + " = " + sum);
        }

    }
}
