package com.example.ValueScannerBot.service;

import com.example.ValueScannerBot.dto.CourseDto;
import com.example.ValueScannerBot.repository.CourseRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data

public class DtoService {
    @Autowired
    private final CourseRepository courseRepository;


    public void save(CourseDto dto){
        courseRepository.save(dto);
    }

}
