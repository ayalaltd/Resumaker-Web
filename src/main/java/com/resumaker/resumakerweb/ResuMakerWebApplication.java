package com.resumaker.resumakerweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.resumaker.resumakerweb.SubmitController;
@SpringBootApplication
public class ResuMakerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResuMakerWebApplication.class, args);
        String [] info = {"Mohamad Saleh", "mohs@outlook.com", "707-414-2323"};
        SubmitController.contactSubmit(info);
    }

}
