import java.util.List;

public class ManageService {
    // Co chuc nang in ra danh sach
    // cach xai upcasting/ downcasting
    public void printInfoObject(List list) {
        //upcasting: lay cha chua gia tri tham chieu cua con
        for (Object i : list) {
            System.out.println(i);
        }
    }
}
