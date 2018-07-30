package cn.cairenhe.maid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MaidApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaidApplication.class, args);
        System.out.println("hello");
    }
}
