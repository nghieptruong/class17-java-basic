public class ArrayDemo {
    public static void main(String[] args) {
        //Khai bao 1 mang so nguyen co kich thuoc 5 phan tu
        int[] arrInt = new int[5];

        //In ra kich thuoc cua mang
        System.out.println(arrInt.length);

        //In ra phan tu dau tien
        System.out.println(arrInt[0]); // 0
        System.out.println(arrInt[1]); // ???

        //Gan gia tri cho mang
        arrInt[0] = 2;
        arrInt[1] = 3;
        arrInt[2] = 5;
//        arrInt[3] = 1;
//        arrInt[4] = 7;

        //In ra gia tri tai index 3
        System.out.println(arrInt[3]); // 0

        //Cach 2 de khai bao mang
        String[] arrStr = {"Hello", "Java", "Testing"};
        System.out.println(arrStr.length); // 3
//        arrStr[3] = "Automation"; // loi out of bound (vuot bien)

        //Duyet mang dung vong lap for
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println(arrStr[i]);
        }

        //Duyet mang bang vong lap foreach
        for (String s : arrStr) {
            System.out.println(s);
        }

        //Khai bao mang 2 chieu: hang x cot
        int[][] arr2D = new int[3][4];

        //In ra phan tu o hang 1 cot 1
        System.out.println(arr2D[1][1]); // 0

        //In ra so hang
        System.out.println(arr2D.length); // 3

        //In ra so cot
        System.out.println(arr2D[0].length); // 4

        //Gan gia tri cho mang 2 chieu
        for (int i = 0; i < arr2D.length ; i++) {
            for (int j = 0; j < arr2D[0].length; j++) {
                arr2D[i][j] = 1;
            }
        }

        //Duyet mang 2 chieu
        System.out.println("--------------");
        for (int i = 0; i < arr2D.length ; i++) {
            for (int j = 0; j < arr2D[0].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
