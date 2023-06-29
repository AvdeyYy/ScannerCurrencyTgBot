package com.example.ValueScannerBot;

import com.example.ValueScannerBot.service.C1;
import com.example.ValueScannerBot.service.CourseParserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Arrays;


@SpringBootApplication
//exclude={DataSourceAutoConfiguration.class})
public class ValueScannerBotApplication {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(ValueScannerBotApplication.class, args);
		CourseParserService courseParserService = new CourseParserService();
		System.out.println(courseParserService.currentValues()[2]);
		C1 c1 = new C1();
		c1.save(courseParserService.currentValues()[2]);
	}
}
