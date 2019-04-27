import com.wzy.ApplicationConfig;
import com.wzy.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);
        OrderService orderService = context.getBean(OrderService.class);
        //System.out.println(orderService);//com.wzy.service.impl.OrderServiceImpl@3e58a80e
        orderService.get();
    }

}
