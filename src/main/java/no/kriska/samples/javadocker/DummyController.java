package no.kriska.samples.javadocker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kristofferskaret on 07.07.2016.
 */
@RestController
public class DummyController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot, Gradle and Docker!";
    }
}
