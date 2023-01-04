package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
        Greeter greet = ctx.getBean("greeter", Greeter.class); // p47 getBean()
        String msg = greet.greet("스프링");
        System.out.println(msg);
        ctx.close();
    }
}