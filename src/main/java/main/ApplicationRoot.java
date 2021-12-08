package main;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRoot {
    public static void main(String[] args) {
        Application.launch(JavaFxRoot.class, args);
    }
}
