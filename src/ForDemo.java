public class ForDemo {
    public static void main(String[] args) {
        // vong lap for: lap lai 1 xu ly co dieu kien dừng
        // for(<dieu kien khoi tao> ; <kiem tra de dừng> ; <tang/giam>)
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Hello");
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hello");
//        }
        // 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10 (< 10) -> F -> Exit loop
        // H -> H -> H -> H -> H -> H -> H -> H -> H -> H

//        for (int i = 10; i >= 1; i--) {
//            System.out.println("Hello " + i);
//        }
        // 10 -> 9 -> 8 -> ... -> 1 -> 0 (0 >= 1) --> F --> exit
        // H  -> H -> H -> ... -> H

        /*
            In ra tat ca so chan tu 1 toi 20
         */
//        for (int i = 1; i <= 20; i++) {
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        /*
           In ra hinh tam giac:
           Nhap n = 5
           *
           * *
           * * *
           * * * *
           * * * * *
         */
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
