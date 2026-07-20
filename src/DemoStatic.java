import java.util.Random;
import java.util.Scanner;

public class DemoStatic {
    public static void main(String[] args) {
        /*
            Ham static: input
            Ham static: check
            Ham static: run
        */

        DemoStatic.run();

    }
    static String input()
    {
        System.out.println("Nhan answer la 'chan' hoac 'le'");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;
    }

    static void check (String answer)
    {
        Random random = new Random();
        int randomValue;
        boolean isWin = false;
        while (isWin==false)
        {
            randomValue = random.nextInt(1, 10);
            if ((randomValue%2==0 && answer.equals("chan"))||(randomValue%2!=0 && answer.equals("le")))
            {
                isWin = true;
                System.out.println("You win!!!");
            }
            else
            {
                System.out.println("Doan sai!");
                System.out.println("So he thong la "+ randomValue);
                System.out.println("Hay thu lai");
                Scanner scanner = new Scanner(System.in);
                answer = scanner.nextLine();
            }
        }
    }
    static void run ()
    {
        String answer = DemoStatic.input();
        DemoStatic.check(answer);
    }
}
