public class DemoAbstraction {
    public static void main(String[] args) {
        Square s = new Square(5);
//        s.setA(5);
        System.out.println(s.calcArea());
        s.draw();
        s.paint();
        System.out.println(s.count);

        Rectangle r = new Rectangle(2, 3);
//        r.setHeight(2);
//        r.setWidth(3);
        System.out.println(r.calcArea());
        r.draw();
        r.paint();
        System.out.println(r.count);

//        Tang count len 1
        Shape.count++;
        System.out.println("Sau khi tang 1");
        System.out.println("Shape = " + Shape.count);
        System.out.println("Rectange = " + r.count);
        System.out.println("Square = " + s.count);

        Drawable.inform();
    }
}
