import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboProvider {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        context.start();
        //维持提供者
        Thread.sleep(Long.MAX_VALUE);
    }
}
