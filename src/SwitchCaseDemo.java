import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        /*
        Nhap vao browser (chrome/firefox/safari/edge)
        Neu browser la chrome --> Run on chrome
        Neu browser la firefox --> Run on firefox
        Neu browser la safari --> Run on safari
        Neu browser la edge --> Run on edge
        Nguoc lai --> 'Not support !'
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser: ");
        String browser = sc.nextLine();
        System.out.println("Your browser: " + browser);

//        switch(browser.toLowerCase()) {
//            case "chrome":
//                System.out.println("Run on chrome");
//                break;
//            case "firefox":
//                System.out.println("Run on firefox");
//                break;
//            case "safari":
//                System.out.println("Run on safari");
//                break;
//            case "edge":
//                System.out.println("Run on edge");
//                break;
//            default:
//                System.out.println("Not support !");
//        }

        /*
            Neu browser la chrome hoac firefox hoac edge --> Run on App Version >= 136
            Nguoc lai neu browser la safari --> Run on App Version < 136
            Nguoc lai  --> "Not Support !"
            Cach tiep can la if-else:
            if(browser.equals("chrome") || browser.equals("firefox") || browser.equals("edge"))
                in ra "Run on App Version >= 136"
            else if (browser.equals("safari"))
                in ra --> Run on App Version < 136
            else
                "Not Support !"
         */
        switch(browser.toLowerCase()) {
            case "chrome":
            case "firefox":
            case "edge":
                System.out.println("Run on App Version >= 136");
                break;
            case "safari":
                System.out.println("Run on App Version < 136");
                break;
            default:
                System.out.println("Not support !");
        }

    }
}
