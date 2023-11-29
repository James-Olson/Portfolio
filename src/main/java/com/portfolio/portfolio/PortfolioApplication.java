package com.portfolio.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.InputStream;

@SpringBootApplication
public class PortfolioApplication {

    public static void main(String[] args) {

        InputStream mp4Stream = PortfolioApplication.class.getClassLoader().getResourceAsStream("6048474_Clouds Sky Mount Tamalpais Trees_By_Brad_Kremer_Artlist_HD.mp4");
        SpringApplication.run(PortfolioApplication.class, args);



    }

}
