public class FirstScript {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        // Khai bao bien va khoi tao gia tri la 1
        int x = 1;

        // Khai bao bien truoc (chua co gan gia tri)
        int y;

        //Gán giá trị
        y = 2;

        int z = x + y;
        System.out.println(z);

        // Kieu du lieu co ban (Primitive Type)
        // 1. Kieu so nguyen (byte, short, int, long)
        System.out.println(Byte.MIN_VALUE); // min value cua kieu byte (-128)
        System.out.println(Byte.MAX_VALUE); // max value cua kieu byte (127)

        // 2. Kieu so thuc (float, double)
        float f = 15.5f;
        double d = 34.6;

        // 3. Kieu luan ly true/false (boolean)
        boolean isPassed = true;

        // 4. Kieu ký tự (char)
        char c = 'e';

        // 5. Kieu chuỗi (String): ko phai la kieu du lieu co ban
        // String is immutable class (class ko dc chinh sua)
        String s = "Hello";



    }
}
