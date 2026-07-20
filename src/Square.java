public class Square extends Shape implements Drawable {
    private int a;

    //Ham khoi tao khong tham so
    public Square() {
        this.a = 1;
    }

    //Ham khoi tao 1 tham so (constructor)
    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    int calcArea() {
        return a * a;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square...");
    }
}
