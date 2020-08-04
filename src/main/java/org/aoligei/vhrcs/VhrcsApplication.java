package org.aoligei.vhrcs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "org.aoligei.vhrcs.mapper")
@SpringBootApplication
public class VhrcsApplication {

    public static void main(String[] args) {
        SpringApplication.run(VhrcsApplication.class, args);
    }

}
