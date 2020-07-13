import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.dubbo.demo.DemoService;
 
public class Consumer {
    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-dubbo-client.xml"});
        context.start();
//        // Obtaining a remote service proxy
        DemoService demoService = (DemoService)context.getBean("demoService");
        System.out.println("----------demoService:"+demoService.getClass());
//        // Executing remote methods
        String hello = demoService.sayHello("world");
//        // Display the call result
        System.out.println(hello);
    }
}