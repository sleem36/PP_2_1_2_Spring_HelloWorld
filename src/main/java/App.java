import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) context.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) context.getBean("helloworld");
        System.out.println(bean == bean2);

        Cat cat1 = context.getBean("catBean", Cat.class);
        Cat cat2 = context.getBean("catBean", Cat.class);
        System.out.println(cat1 == cat2);
        
        //context.close();
    }
}