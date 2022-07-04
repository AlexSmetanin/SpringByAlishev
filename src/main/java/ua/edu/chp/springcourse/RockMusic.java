package ua.edu.chp.springcourse;

import org.springframework.stereotype.Component;

//@Component("musicBean")   // бин будет иметь имя "musicBean"
@Component                  // бин будет иметь имя как имя класса "rockMusic"
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
