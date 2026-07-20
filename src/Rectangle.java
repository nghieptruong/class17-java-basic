public class Rectangle extends Shape implements Drawable {
    private int width;
    private int height;

    public Rectangle() {
        width = 1;
        height = 2;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    int calcArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectange...");
    }
}
