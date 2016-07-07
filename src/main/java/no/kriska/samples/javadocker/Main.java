package no.kriska.samples.javadocker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * Created by kristofferskaret on 04.07.2016.
 */
@SpringBootApplication
public class Main {

   private static Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.info("Hello docker!!!");

        SpringApplication.run(Main.class, args);
    }
}
