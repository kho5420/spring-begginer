package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

    @Bean
    public Greeter greeter() {
        Greeter greet = new Greeter();
        greet.setFormat("%s, 하이요");
        return greet;
    }
}
