package com.example.ValueScannerBot;

import com.example.ValueScannerBot.service.CourseParserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;


@SpringBootApplication
//exclude={DataSourceAutoConfiguration.class})
public class ValueScannerBotApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ValueScannerBotApplication.class, args);
		CourseParserService courseParserService = new CourseParserService();
		System.out.println(courseParserService.currentValues("ETH"));


	}
}
