import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Main start *****************");
        System.out.println(new Date());
        Student student = new Student();
        student.sayHello();
        System.out.println("Hello Main end **************");
    }
}
