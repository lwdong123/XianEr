package com.example.dcits;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dcits.dao")
public class DcitsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DcitsApplication.class, args);
    }

}
