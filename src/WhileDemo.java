import java.util.Random;
import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        //for: biet chac so lan lap (10 - 1) -> kiem tra dieu kien (neu co dau = thi + 1) -> 10
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Hello");
//        }

        //for: biet chac so lan lap (10 - 1) -> kiem tra dieu kien -> 9
//        for (int i = 1; i < 10; i++) {
//            System.out.println("Hello");
//        }

        //for: biet chac so lan lap (10 - 0) -> kiem tra dieu kien -> 10
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hello");
//        }

        //Vong lap while: co the ko biet so lan lap chinh xac
//        int i = 1;
//        while(i <= 10) {
//            System.out.println("Hello " + i);
//            i++;
//        }

        /*
        Game: Chuong trinh se chay sinh ra 1 so ngau nhien (so nguyen 1 -> 10).
                Ban doan cai so sinh ra la chan hay le ? --> can prompt nguoi choi nhap "chan" hoac "le"
                Neu tra loi dung thi ban thang --> You Win !
                Neu ban thua --> doan tiep --> toi khi nao ban thang (ko biet so lan lap -- ko biet doan bao nhieu lan moi thang)
        Goi y:
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();

            Random random = new Random();
            int randomValue = random.nextInt(1, 10);
            System.out.println(randomValue);
         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean isContinue = true; // mac dinh cho tiep tuc (flag)

        while (isContinue) {
            int randomValue = random.nextInt(10) + 1; // moi lan sinh 1 con so ngau nhien
            System.out.print("Nhap 'chan' hoac 'le': ");
            String answer = scanner.nextLine();

            if ((randomValue % 2 == 0 && answer.equalsIgnoreCase("chan")) || (randomValue % 2 != 0 && answer.equalsIgnoreCase("le"))) {
                System.out.println("You Win!");
                isContinue = false;
            } else {
                System.out.println("Ban doan sai!");
                System.out.println("So ngau nhien cua he thong: " + randomValue);
                System.out.println("Vui long thu lai!");
            }
        }

        scanner.close();


    }
}
