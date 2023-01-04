package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
        Greeter greet = ctx.getBean("greeter", Greeter.class); // p51 싱글톤
        Greeter greet2 = ctx.getBean("greeter", Greeter.class);

        System.out.println("(greet == greet2) = " + (greet == greet2));
        ctx.close();
    }
}