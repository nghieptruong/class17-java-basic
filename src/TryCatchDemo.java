public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 2);
        } catch (Exception e) {
            System.out.println("Khong duoc phep chia cho 0");
        } finally {
            System.out.println("End program");
        }
    }
}
