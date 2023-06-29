package com.example.ValueScannerBot.service;

import com.example.ValueScannerBot.dto.CourseDto;
import com.example.ValueScannerBot.repository.CourseRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class C1 {
    @Autowired
    private  CourseRepository courseRepository;
    private  CourseParserService parserService = new CourseParserService();

    public void save( CourseDto courseDto){
       courseRepository.save(courseDto);
    }


}
