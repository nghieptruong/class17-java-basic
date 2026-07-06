import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        /*Giả định giá vé xe bus đi Hà Nội – Hạ Long:
        Từ 0 – 5 tuổi: Miễn phí
        Từ 6 -19 tuổi: 80000
        Từ 20 – 60 tuổi: 100000
        Từ 61 – 120 tuổi: 80000
        Các trường hợp không nằm trong độ tuổi quy định trên được coi là không hợp lệ
            Yeu cau: User nhap sai, yeu cau user nhap lai
            Neu user nhap sai --> in ra Invalid input! Age should be in [0 - 120]
            Goi y: try-catch, vong lap
        */


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Your age: " + age);

        if(age >= 0 && age <= 5) {
            System.out.println("Miễn phí");
        } else if(age >= 6 && age <= 19) {
            System.out.println("80000");
        } else if(age >= 20 && age <= 60) {
            System.out.println("100000");
        } else if(age >= 61 && age <= 120) {
            System.out.println("120");
        } else {
            System.out.println("Khong hop le !");
        }
    }
}
// TC01: 0 ==> Miễn phí
// TC02: 5 ==> Miễn phí
// TC03: 3 ==> Miễn phí
// TC04: 1 ==> Miễn phí
// TC05: 4 ==> Miễn phí
// TC06: -1 ==> Khong hop le
// TC05: 6 ==> 80000