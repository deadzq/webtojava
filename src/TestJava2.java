//基础类型和其包装类的一些区别
public class TestJava2 {

    private static int sex;
    private static Integer sex_;

    public static void main(String[] args) {

        System.out.println(sex); //0
        System.out.println(sex_); //null

    }
}
