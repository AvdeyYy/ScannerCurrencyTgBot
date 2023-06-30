package com.example.ValueScannerBot.repository;
import com.example.ValueScannerBot.dto.CourseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends JpaRepository<CourseDto, Long> {
}
