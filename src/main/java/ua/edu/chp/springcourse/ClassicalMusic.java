package ua.edu.chp.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*IMPORTANT: @PostConstruct and @PreDestroy have been completely removed in Java 11.
To keep using them, you'll need to add the javax.annotation-api JAR to your dependencies.*/

@Component
// @Scope("prototype") // singleton
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
