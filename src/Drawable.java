public interface Drawable {
    //Khong duoc phep khoi tao doi tuong

    //mac dinh method trong interface la public va abstract (ko can tuong minh khai bao)
    void draw();

    //khai bao ham default
    default void paint() {
        System.out.println("Painting blue color...");
    }

    //khai bao ham static
    static void inform() {
        System.out.println("Task completed !");
    }
}
