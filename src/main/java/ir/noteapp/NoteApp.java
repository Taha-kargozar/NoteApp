package ir.noteapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NoteApp {
    public static void main(String[] args) {
        System.out.println("Start the app :");

        SpringApplication.run(NoteApp.class,args);
    }
}
