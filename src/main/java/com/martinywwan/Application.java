package com.martinywwan;

import com.martinywwan.launcher.SparkRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(SparkRunner.class);
    }
}
