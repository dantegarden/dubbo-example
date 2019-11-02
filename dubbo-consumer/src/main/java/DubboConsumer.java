import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.OrderService;

public class DubboConsumer {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();
        OrderService orderService = context.getBean(OrderService.class);
        orderService.initOrder(1L);
        //维持消费者
        Thread.sleep(Long.MAX_VALUE);
    }
}
