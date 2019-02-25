import org.junit.Test;

public class Main {

    @Test
    public void testHelloWrold() {
        System.out.println("HelloWorld!");
        System.out.println("a修改了代码");
    }

    @Test
    public void test1() {
        System.out.println("a修改了代码2");
        int a = 10;
        System.out.println("测试01修改");

    }

    @Test
    public void test2() {
        System.out.println("b修改了代码2");
        System.out.println("b修改了代码2");
        int b = 20;
    }

    @Test
    public void test001(){
        System.out.println("测试01");
    }
}