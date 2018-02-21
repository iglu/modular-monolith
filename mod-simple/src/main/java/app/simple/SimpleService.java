package app.simple;

import org.springframework.stereotype.Component;

@Component
public class SimpleService {
    public String getGreeting(){
        return "Hello, World!";
    }
}
