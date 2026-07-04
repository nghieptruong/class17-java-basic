public class OperatorDemo {
    public static void main(String[] args) {
        //1. Toan tu so hoc (+, - , *, /, %)
        //% la lay so du
        int x = 1;
        int result1 = x / 2;
        System.out.println(result1); // 0

        //chia lay so dư
        int result3 = x % 2;
        System.out.println(result3); // 1

        int result2 = 4 / 3;
        System.out.println(result2); // 1

        x = 2; // cho phep gan lai

        // 1 / 2 --> muon lay ket qua la so thap phan
        double result4 = 1.0 / 2.0; // 0.5
        System.out.println(result4);

        // 2. Toan tu gán (=, +=, -=, *=, /=, %=)
        // += cộng rồi gán
        x += 1;  // Viet tat cua phep toan x = x + 1
        System.out.println(x); // 3

        // 3. Toan tu so sanh (>, <, >=, <=, !=, ==) ==> se tra ve true/false
        System.out.println(2 > 0); // true
        System.out.println(-1 <= 0 ); // true
        System.out.println(5 >= 10); // false
        System.out.println(x == 3); // true

        // 4. Toan tu logic (&&, ||, !)
        // Phep toan && (và): x && y (cả hai x và y bắt buộc phải là true thì mới trả về true)
        //          x = true,   y = true    ==> x && y ==> true
        //          x = true,   y = false   ==> x && y ==> false
        //          x = false,  y = true    ==> x && y ==> false
        //          x = false,  y = false   ==> x && y ==> false
        boolean b1 = true;
        boolean b2 = true;
        System.out.println(b1 && b2); // true

        // Phep toan || (hoặc): x || y (1 trong 2 là true thì trả về true)
        //          x = true,   y = true    ==> x || y ==> true
        //          x = true,   y = false   ==> x || y ==> true
        //          x = false,  y = true    ==> x || y ==> true
        //          x = false,  y = false   ==> x || y ==> false
        boolean c1 = true;
        boolean c2 = false;
        System.out.println(c1 || c2); // true

        // ! la phep toan phu dinh
        boolean isMatch = true;
        // muon bien isMatch tro thanh false
        isMatch = false;
        // cach 2
        System.out.println(!isMatch); // tro thanh true lai

        isMatch = !isMatch;
        System.out.println(!isMatch); // false

        //5. Toan tu dieu kien (if else)

        //6. Toan tu tang/giam (++, --)
        int k = 0;
        k = k + 1; // hoac k += 1
        System.out.println(k); // 1

        int m = 5;
        m++; // tu dong tang len 1 (hậu tố)
        System.out.println(m); // 6
        ++m; // tu dong tang len 1 (tiền tố)
        System.out.println(m); // 7

        //hậu tố (++ phía sau): tăng sau. B1: thực hiện toán tử khac trước. B2: tăng lên 1
        int n = 1;
        int w = n++; // B1: int w = n; --> int w = 1 --> B2: n = n + 1 --> n = 1 + 1 = 2
        System.out.println("n = " + n); // 2
        System.out.println("w = " + w); // 1

        //tiền tố (++ phía trước): tăng trước: B1: tăng lên 1 trước. B2: thực hiện toán tử khác sau
        n = 1; // gán lại --> reset giá trị
        w = ++n; // B1: n = n + 1 --> n = 1 + 1 = 2 --> B2: w = n --> w = 2
        System.out.println("n = " + n); // 2
        System.out.println("w = " + w); // 2

        //Tóm lại ++,-- đứng 1 mình ko cần quan tâm thứ tự thực hiện
        //Nếu có phép toán khác thì theo thứ tự thực hiện
        //Kết quả cuối cùng lúc nào cũng tăng lên 1, tiền tố/hậu tố chỉ ảnh hưởng tới phép toán khác

//        int o = 8;
//        int p = 2;
//        int r = o - ++p;  // int r = o - (++p);
//        System.out.println("o = " + o); // 8
//        System.out.println("p = " + p); // 3
//        System.out.println("r = " + r); // 5

        int o = 8;
        int p = 2;
        p++; // p = p + 1; hoac p += 1;
        int r = o - p;
        System.out.println("o = " + o); // 8
        System.out.println("p = " + p); // 3
        System.out.println("r = " + r); // 5

    }
}
