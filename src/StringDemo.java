public class StringDemo {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println(x == y);

        System.out.println("--------------");
        String s1 = "Hello"; // khai bao literal --> tim trong string pool, neu co tra ve dia chi do, neu ko co thi dua vao string pool
        System.out.println("s1 = " + System.identityHashCode(s1)); // 1791741888
        String s2 = "Hello";
        System.out.println("s2 = " + System.identityHashCode(s2)); // 1791741888
        System.out.println(s1 == s2); // true --> 1791741888 == 1791741888

        String s3 = new String("Hello"); // Tao doi tuong moi kieu String (ko khuyen khich dùng)
        System.out.println(s3); // Hello
        System.out.println("s3 = " + System.identityHashCode(s3)); // 883049899
        System.out.println(s1 == s3); // false --> 1791741888 == 883049899

        System.out.println("--------------------");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true

        System.out.println("--------------------");
        String s4 = s3.intern(); // dua doi tuong o Heap space vao string pool
        System.out.println(s1 == s4); // true

        //Tom lai: khi so sanh 2 gia tri kieu chuoi ko dung phep toan == (so sanh 2 dia chi tham chiếu)
        //thay vao do phai bat buoc dung .equals (dang so sanh nội dung)




    }
}
